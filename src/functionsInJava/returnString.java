package functionsInJava;

import java.util.Scanner;

public class returnString {

    public static String greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        
        return "Welcome, " + name;
    }
    public static void main(String[] args) {
        String msg = greeting();
        System.out.print(msg);
    }
}
