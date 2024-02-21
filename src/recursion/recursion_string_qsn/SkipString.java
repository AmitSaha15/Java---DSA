package recursion.recursion_string_qsn;

public class SkipString {
    public static void main(String[] args) {
        String remove = "apple";
        System.out.println(skipWord("bcdapplefg", remove));
    }

    static String skipWord(String str, String word){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(word)){
            return skipWord(str.substring(5), word);
        } else{
            return str.charAt(0) + skipWord(str.substring(1), word);
        }
    }
}
