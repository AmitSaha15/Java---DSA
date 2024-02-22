package recursion.recursion_string_qsn;

public class SubSeq {
    public static void main(String[] args) {
        sequences("", "abc");
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
}
