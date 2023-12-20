package arrayAndArrayList;

public class largestElement {

    static int max(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {17,6,9,3,10};

        System.out.println(max(arr));
    }
}
