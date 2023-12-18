// Print all 3 digit armstrong numbers

package functionsInJava;

public class armstrongNums {

    static boolean armstrong(int n){
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
        System.out.println(armstrong(153));
    }
}
