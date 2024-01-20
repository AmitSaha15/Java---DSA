package recursion;

public interface Fibonacci {

    static int fibo(int n){
        // base condition
        if(n < 2){
            return n;
        }

        // recursive call
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }
}
