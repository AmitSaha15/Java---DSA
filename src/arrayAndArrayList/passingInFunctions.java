package arrayAndArrayList;

import java.util.Arrays;

public class passingInFunctions {

    public static void change(int arr[]){
        arr[0] = 99;
    }
    public static void main(String[] args) {
        int nums[] = {3,5,8,9};
        System.out.println(Arrays.toString(nums));

        change(nums);
        System.out.println(Arrays.toString(nums));
    }
}
