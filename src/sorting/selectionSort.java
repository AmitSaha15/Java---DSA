package sorting;

import java.util.Arrays;

public class selectionSort {
    static int getMaxIndex(int[] arr, int start,int end){
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selection_sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex);
        }
    }
    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
        selection_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
