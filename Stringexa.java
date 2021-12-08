import java.util.Arrays;

public class Stringexa {

    public static void main(String[] args) {
        String[] word1 = { "ab", "c" };
        String[] word2 = { "a", "bc" };
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return (String.join("", word1).equals(String.join("", word2)));
    }

}
