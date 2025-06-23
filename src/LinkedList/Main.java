package LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLL list = new MyLL();

        list.insertFirst(8);
        list.insertFirst(19);
        list.insertFirst(10);
        list.insertFirst(12);
        list.insertFirst(16);
        list.insertLast(99);
        list.insert(100, 3);
        list.insertRec(28, 3);

        list.displayList();

        // list.deleteFirst();
        // list.deleteLast();
        // System.out.println(list.delete(2));

        // list.displayList();

        // CLL
        // CLL list = new CLL();
        // list.insertFirst(1);
        // list.insertFirst(2);
        // list.insertFirst(3);
        // list.insertFirst(4);
        // list.insertLast(55);
        // list.insert(100, 2);
        // list.display();
        // list.delete(55);
        // list.display();
    }
}
