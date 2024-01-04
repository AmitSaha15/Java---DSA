package sorting;

import java.util.Arrays;

public class cyclicSort {

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cyclic_sort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i]-1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,5,2,1,4};
        cyclic_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
