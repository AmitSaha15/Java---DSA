package LinkedList;

public class MyLL {

    private Node head;
    private Node tail;

    private int size;

    public MyLL() {
        this.size = 0;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteFirst() {
        int deletedVal = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        size--;
        return deletedVal;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int deletedVal = prev.next.val;
        prev.next = prev.next.next;
        size--;

        return deletedVal;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int deletedVal = tail.val;
        tail = secondLast;
        tail.next = null;

        size--;
        return deletedVal;
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
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;

        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    // insertion using recursion
    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node curr) {
        if (index == 0) {
            Node temp = new Node(val, curr);
            size++;
            return temp;
        }

        curr.next = insertRec(val, index - 1, curr.next);
        return curr;
    }

    // reverse a LL using recursion
    public void reverseLL(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        reverseLL(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
