package StackAndQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
        CircularQueue queue = new CircularQueue(5);
        queue.add(3);
        queue.add(15);
        queue.add(18);
        queue.add(27);
        queue.add(24);

        queue.display();

        System.out.println(queue.remove());
        queue.add(155);
        queue.display();
        System.out.println(queue.front());

    }
}
