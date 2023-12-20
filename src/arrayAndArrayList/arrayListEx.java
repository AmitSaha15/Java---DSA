package arrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListEx {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);

        // list.add(79);
        // list.add(88);
        // list.add(95);
        // list.add(82);
        // list.add(90);
        // list.add(89);

        // System.out.println(list);
        // // System.out.println(list.contains(82));
        // list.set(0, 99);
        // list.remove(2);
        // System.out.println(list);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        System.out.println(list);
    }
}
