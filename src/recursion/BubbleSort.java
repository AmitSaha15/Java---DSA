package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {5,4,1,3,2};
        bubble(nums, nums.length-1, 0);
        System.out.println(Arrays.toString(nums));
    }
    static void bubble(int[] arr, int i, int j){
        if(i == 0) return;
        
        if (j < i) {
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
            bubble(arr, i, j+1);
        } else{
            bubble(arr, i-1, 0);
        }
    }
}
