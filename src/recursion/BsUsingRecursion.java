package recursion;

public class BsUsingRecursion {
    static int search(int[] arr, int target, int start, int end){
        if (start > end) {
            return -1;
        }

        int mid = start+(end-start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return search(arr, target, start, mid-1);
        }

        return search(arr, target, mid+1, end);
    }
    public static void main(String[] args) {
        int[] nums = {44,88,120,244,488,597};
        int target = 488;
        System.out.println(search(nums, target, 0, nums.length-1));
    }
}
