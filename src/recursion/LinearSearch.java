package recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {10,7,9,14,2,9};
        int target = 9;
        System.out.println(search(nums, target, 0));
        System.out.println(findIndex(nums, target, 0));
        System.out.println(findAllIndex(nums, target, 0, new ArrayList<Integer>()));
    }

    static boolean search(int[] arr, int target, int index){
        if (index > arr.length-1) {
            return false;
        }

        return (arr[index] == target) || search(arr, target, index+1);
    }

    static int findIndex(int[] arr, int target, int index){
        if (index > arr.length-1) {
            return -1;
        }
        if(arr[index] == target){
            return index;
        } else{
            return findIndex(arr, target, index+1);
        }
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index > arr.length-1) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr, target, index+1, list);
    }
}
