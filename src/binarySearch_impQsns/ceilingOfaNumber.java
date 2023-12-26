package binarySearch_impQsns;

public class ceilingOfaNumber {

    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }

        return arr[start];
    }
    public static void main(String[] args) {
        int[] nums = {2,5,9,13,21,25,31,45};
        int target = 22; 
        System.out.println(ceiling(nums, target));
    }
}
