package challenges;

public class ContainsEnglish {
    /* Given a string of any length with any characters in it, write a function to determine whether
     * the string contains the whole word "english". The order of characters/spelling is
     * important, a string "agkjnenglishsad" would return true while "asdneglihsth" would return
     * false. Upper and lower case does not matter. Return values should be booleans (true/false).
     * Examples:
     * Input: "FaagdnglishAGG" | Output: false
     * Input: "SMFENgliSHasnD" | Output: true
     */

    private static boolean containsWord(String string, String word) {
        return string.toLowerCase().contains(word.toLowerCase());
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "FaagdnglishAGG", // false
                "SMFENgliSHasnD", // true
                "asdneglihsth", // false
                "agkjnenglishsad", // true
                "?;TzxU$x2|EnGliSh&efY2S*B.x}", // true
                "gBNa0|_x:eng1lsh#F:qtQ" // false
        };

        for (String string : testStrings) {
            System.out.println(containsWord(string, "English"));
        }
    }
}
