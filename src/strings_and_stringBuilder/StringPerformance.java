package strings_and_stringBuilder;

public class StringPerformance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char letter = (char)('a'+i);
            series += letter;
        }

        System.out.println(series);
        // creating new object(of String class) every time
        // It is of O(n^2) time coplexity. the best solution is StringBuilder
    }
}
