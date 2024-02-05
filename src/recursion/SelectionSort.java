package recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {9,1,5,3,6};
        selection(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    static void selection(int[] arr, int i, int j, int max){
        if (i == 0) {
            return;
        }

        if (i > j) {
            if (arr[j] > arr[max]) {
                selection(arr, i, j+1, j);
            } else{
                selection(arr, i, j+1, max);
            }
        } else{
            swap(arr, i-1, max);
            selection(arr, i-1, 0, 0);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
