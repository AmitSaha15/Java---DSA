package arrayAndArrayList;

import java.util.Arrays;

public class reverseArray {

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {17,6,9,3,10};
        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
}
