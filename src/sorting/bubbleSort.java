package sorting;

import java.util.Arrays;

public class bubbleSort {
    static void bubble_sort(int[] arr){
        boolean swapped;
        int n = arr.length;
        // run the steps n-1 times
        for (int i = 0; i < n; i++) {
            swapped = false;
            // for each step max item will be at the last respective index
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // if you didn't swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {-5,-3,0,9,7,-1};
        bubble_sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
