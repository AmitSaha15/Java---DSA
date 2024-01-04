package sorting;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] nums = {57,0,-5,2,6};
        insertion_sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertion_sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
