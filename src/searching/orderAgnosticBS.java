package searching;

// Order Agnostic binary search is when we don't know whether the array is sorted in ascending or descending order

public class orderAgnosticBS {

    static int order_agnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        // checking whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (end >= start) {

            // int mid = (start+end)/2;  

            // if start and end are big values, (start+end) might exceed the range of integer

            // better way to calculate mid is ---->

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            } else{
                if (arr[mid] > target) {
                start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        // int[] nums = {2,5,9,13,21,25,31,45};
        int[] nums = {45,31,25,21,16,13,9,5,1};
        int key = 31; // element to be searched

        System.out.println(order_agnosticBS(nums, key));
    }
}
