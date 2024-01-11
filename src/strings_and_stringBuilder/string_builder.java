package strings_and_stringBuilder;

public class string_builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char letter = (char)('a'+i);
            builder.append(letter);
        }
        System.out.println(builder); // linear time complexity
        // it's not creating new object everytime. just modifying the previous value
        // StringBuider --> mutable
    }
}
