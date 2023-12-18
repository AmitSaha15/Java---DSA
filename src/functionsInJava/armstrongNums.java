// Print all 3 digit armstrong numbers

package functionsInJava;

public class armstrongNums {

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n % 10;
            sum += (rem*rem*rem);
            n = n/10;
        }

        return sum == original;
    }
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
