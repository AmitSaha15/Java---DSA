package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(54);
        deque.add(11);
        deque.add(24);
        deque.add(10);
        deque.addFirst(222);
        deque.addLast(999);

        System.out.println(deque.getFirst()); //222
        System.out.println(deque.getLast()); //999
        System.out.println(deque.removeFirst()); //222
        System.out.println(deque.removeLast()); //999
        System.out.println(deque.getFirst()); //54
        System.out.println(deque.getLast()); //10
    }
}
