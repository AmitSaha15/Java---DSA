package bit_manipulation;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(unique(arr));
    }

    public static int unique(int[] arr){
        int unique = 0;

        for(int num : arr){
            unique ^= num;
        }

        return unique;
    }
}
