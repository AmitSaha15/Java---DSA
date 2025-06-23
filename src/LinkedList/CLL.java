package LinkedList;

public class CLL {
    
    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        } else {
            node.next = head;
            head = node;
            tail.next = head;
        }
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void delete(int val){
        Node temp = head;

        if (temp == null) {
            return;
        }
        if(temp.val == val){
            head = head.next;
            tail.next = head;
            return;
        } else{
            do {
                if(temp.next.val == val){
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            } while (temp.next != head);
        }
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println("HEAD");
    }

    private class Node {
    
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
