package recursion.recursion_string_qsn;

import java.util.ArrayList;

public class SubSeqAscii {
    public static void main(String[] args) {
        System.out.println(sequencesAscii("", "abc"));
    }

    static ArrayList<String> sequencesAscii(String ans, String str){
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> first = sequencesAscii(ans+ch, str.substring(1));
        ArrayList<String> second = sequencesAscii(ans, str.substring(1));
        ArrayList<String> third = sequencesAscii(ans + (ch+0), str.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
