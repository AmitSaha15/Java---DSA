package recursion;

// let's say print first 10 nums

public class PrintNums {
    static void print(int n){
        // base condition
        if(n > 10){
            return;
        }
        // body
        System.out.println(n);
        // recursive call
        print(n+1);
    }
    public static void main(String[] args) {
        print(1);
    }
}
