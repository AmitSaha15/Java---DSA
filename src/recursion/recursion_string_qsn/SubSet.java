package recursion.recursion_string_qsn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = {2,1,2};
        System.out.println(subsetItr(arr));
        System.out.println(subsetItrDup(arr2));
    }

    static List<List<Integer>> subsetItr(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // because initially will have an empty list inside outer

        for(int num : arr){
            int n = outer.size();
            for(int i=0; i<n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); // creating a copy of prev list present in outer list
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    // when there is duplicate subsets to be handled
    // note --> when you find a duplicate element only add it in the newly created subset of previous step
    // if the array is like [2,1,2] in this case it'll fail so we need to sort the array so that the duplicate elements are consecutively placed

    static List<List<Integer>> subsetItrDup(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // because initially will have an empty list inside outer
        int start = 0;
        int end = 0;

        for(int i=0; i<arr.length; i++){
            int n = outer.size();
            start = 0;
            // if current and prev elements are same then --> start = end+1
            if (i>0 && arr[i] == arr[i-1]) {
                start = end +1;
            }
            end = n-1;

            for(int j=start; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j)); // creating a copy of prev list present in outer list
                internal.add(arr[i]);
                outer.add(internal);
            }
        }

        return outer;
    }
}
