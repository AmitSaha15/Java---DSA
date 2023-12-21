package searching;

import java.util.Arrays;

public class searchIn2dArray {

    static int[] serach(int[][] arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr = {
            {9,13,8},
            {21,7},
            {2,5,10},
            {18,88,98,58}
        };
        int target = 5;

        // format of return value {row,col}
        int[] ans = serach(arr, target);
        System.out.print(Arrays.toString(ans));
    }
}
