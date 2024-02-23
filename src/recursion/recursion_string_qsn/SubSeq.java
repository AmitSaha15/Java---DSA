package recursion.recursion_string_qsn;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        // sequences("", "abc");
        System.out.println(sequences2("", "abc"));
    }

    static void sequences(String ans, String str){
        if(str.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);

        sequences(ans+ch, str.substring(1));
        sequences(ans, str.substring(1));
    }

    static ArrayList<String> sequences2(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> left = sequences2(ans+ch, str.substring(1));
        ArrayList<String> right = sequences2(ans, str.substring(1));

        left.addAll(right);
        return left;
    }
}
