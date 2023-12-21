package searching;

public class linearSearch {

    static int linear_search(int[] arr, int elem){
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,9,13,8,21,7};
        int key = 10; // element to be searched

        int index = linear_search(nums, key);

        if (index == -1) {
            System.out.print("Not found!");
        } else{
            System.out.print("The element is at index: " + index);
        }
    }
}
