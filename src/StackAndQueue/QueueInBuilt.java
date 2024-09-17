package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInBuilt {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(3);
        queue.add(15);
        queue.add(18);
        queue.add(27);
        queue.add(24);

        System.out.println(queue.peek()); //3
        System.out.println(queue.remove()); //3
        System.out.println(queue.remove()); //15
        System.out.println(queue.remove()); //18
        System.out.println(queue.remove()); //27
        System.out.println(queue.remove()); //24
    }
}
