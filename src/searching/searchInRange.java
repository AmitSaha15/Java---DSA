package searching;

public class searchInRange {

    // search for a number in a certain range

    static boolean search(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return false;
        }

        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,9,13,8,21,7};
        int key = 21;
        System.out.println(search(nums, key, 1, 3));
    }
}
