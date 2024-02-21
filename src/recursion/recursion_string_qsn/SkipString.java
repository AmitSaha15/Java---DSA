package recursion.recursion_string_qsn;

public class SkipString {
    public static void main(String[] args) {
        String remove = "apple";
        System.out.println(skipWord("bcdapplefg", remove));
        System.out.println(skipAppNotApple("bcappdapplefg", remove));
    }

    static String skipWord(String str, String word){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith(word)){
            return skipWord(str.substring(word.length()), word);
        } else{
            return str.charAt(0) + skipWord(str.substring(1), word);
        }
    }

    static String skipAppNotApple(String str, String word){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith(word)){
            return skipAppNotApple(str.substring(3), word);
        } else{
            return str.charAt(0) + skipAppNotApple(str.substring(1), word);
        }
    }
}
