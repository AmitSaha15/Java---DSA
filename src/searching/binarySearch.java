package searching;

public class binarySearch {

    static int binary_serach(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (end >= start) {

            // int mid = (start+end)/2;  

            // if start and end are big values, (start+end) might exceed the range of integer

            // better way to calculate mid is ---->

            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,9,13,21,25,31,45};
        int key = 31; // element to be searched

        System.out.println(binary_serach(nums, key));
    }
}
