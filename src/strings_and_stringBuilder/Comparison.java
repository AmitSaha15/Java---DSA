package strings_and_stringBuilder;

public class Comparison {
    public static void main(String[] args) {
        String a = "cat";
        String b = "cat";

        System.out.println(a == b); //true

        String name1 = new String("amit");
        String name2 = new String("amit");

        System.out.println(name1 == name2); //false
        System.out.println(name1.equals(name2)); // true --> to only check the value

        System.out.println(name1.charAt(2)); // i
    }
}
