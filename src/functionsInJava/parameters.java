package functionsInJava;

import java.util.Scanner;

public class parameters {

    public static String myGreet(String name){
        String greetMsg = "Hello " + name;
        return greetMsg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = sc.next();
        String nameMsg = myGreet(myName);
        System.out.print(nameMsg);
    }
}
