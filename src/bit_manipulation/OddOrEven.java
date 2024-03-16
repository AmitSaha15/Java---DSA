package bit_manipulation;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 66;
        System.out.println(isOdd(n));
    }

    public static boolean isOdd(int num){
        return (num & 1) == 1;
    }
}
