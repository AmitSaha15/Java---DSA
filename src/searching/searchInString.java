package searching;

public class searchInString {

    static boolean search(String str, char target){
        if (str.length() == 0) {
            return false;
        }

        // for (int i = 0; i < str.length(); i++) {
        //     if (target == str.charAt(i)) {
        //         return true;
        //     }
        // }

        for(char ch : str.toCharArray()){ // toCharArray() => craeting a array of the characters present in the string
            if (ch == target) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String name = "Lionel";
        char target = 'e';

        System.out.println(search(name, target));
    }
}
