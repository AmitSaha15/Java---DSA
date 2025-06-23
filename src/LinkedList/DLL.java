package LinkedList;

public class DLL {
    int size;
    private Node head;

    public void insertFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        newNode.prev = null;
        if(head != null){
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        Node last = head;
        if (head == null) {
            newNode.prev = null;
            head = newNode;
            return;
        }

        while (last.next != null) {
            last = last.next;
        }

        newNode.next = null;
        last.next = newNode;
        newNode.prev = last;
        size++;
    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next, temp);
        temp.next.prev = newNode;
        temp.next = newNode;

        size++;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.val == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int val, int after){
        Node p = find(after);
        if(p == null){
            System.out.println("Doesn't exist");
            return;
        }

        Node newNode = new Node(val);
        newNode.next = p.next;
        p.next = newNode;
        newNode.prev = p;
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }

        size++;
    }

    public void display(){
        Node temp = head;
        System.out.print("START -> ");
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        System.out.print("END -> ");
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }


    private class Node {
    
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
