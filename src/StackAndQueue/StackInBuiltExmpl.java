package StackAndQueue;

import java.util.Stack;

public class StackInBuiltExmpl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(25);
        stack.push(50);
        stack.push(15);
        stack.push(30);
        stack.push(75);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
