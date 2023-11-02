package arrayAndArrayList;

import java.util.*;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

        // input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // printing the array
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // using forEach loop
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }

        // using toString method

        System.out.println(Arrays.toString(arr));
    }
}
