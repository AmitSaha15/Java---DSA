package functionsInJava;

public class funcOverloading {

    static void fun(int a){
        System.out.print(a);
    }

    static void fun(String name){
        System.out.print(name);
    }
    public static void main(String[] args) {
        fun(10);
        fun("Amit");
    }
}
