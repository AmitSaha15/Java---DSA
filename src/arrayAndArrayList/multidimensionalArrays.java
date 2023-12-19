package arrayAndArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalArrays {
    public static void main(String[] args) {

        // int arr2[][] = {
        //     {1,2,3},
        //     {4,5},
        //     {6,7,8,9}
        // };

        int arr[][] = new int[3][3]; //number of rows is mandatory, number of columns is not
        

        // Input
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] =sc.nextInt();
            }
        }

        // Output
        // for (int row = 0; row < arr.length; row++) {
        //     for (int col = 0; col < arr[row].length; col++) {
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
