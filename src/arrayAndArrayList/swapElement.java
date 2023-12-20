package arrayAndArrayList;

import java.util.Arrays;

public class swapElement {

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {7,6,9,3,10};
        System.out.println(Arrays.toString(arr));
        swap(arr, 1, 4);
        System.out.println(Arrays.toString(arr));
    }
}
