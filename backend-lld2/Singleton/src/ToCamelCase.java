import java.util.Arrays;

public class ToCamelCase {

    static String toCamelCase(String str) {
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }

    public static void main(String[] args) {
        String str = "The_Sleath_Warrior";
        String res = toCamelCase(str);
        System.out.println(res);
    }
}
