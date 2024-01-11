package strings_and_stringBuilder;

import java.util.ArrayList;

public class StringConcatenation {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println((char)('a' + 3));
        System.out.println("a" + 3);

        System.out.println("amit" + new ArrayList<>());
        System.out.println("amit" + new Integer(55));


        // System.out.println(new ArrayList<>() + new Integer(55));
        System.out.println(new ArrayList<>() + "" + new Integer(55));
    }
}
