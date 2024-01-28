package recursion;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {1,10,8,9};
        System.out.println(isSorted(nums, 0));
    }

    static boolean isSorted(int[] arr, int index){
        if (index == arr.length-1) {
            return true;
        }
        return (arr[index] < arr[index+1] && isSorted(arr, index+1));
    }
}
