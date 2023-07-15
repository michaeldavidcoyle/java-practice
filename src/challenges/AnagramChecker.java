package challenges;

import java.util.Arrays;

public class AnagramChecker {
    /*
    * Determine whether a word is an anagram of another. Return true if it is, and false if it is not.
    * Example:
    * Input: deco, code | Output:true
    * Input: last, nope | Output: false
    */

    private static boolean isAnagram(String string1, String string2) {
        String[] comparisonChars1 = string1.replaceAll("[^a-zA-Z0-9]", "").split("");
        String[] comparisonChars2 = string2.replaceAll("[^a-zA-Z0-9]", "").split("");

        if (comparisonChars1.length != comparisonChars2.length) return false;

        for (int i = 0; i < comparisonChars1.length; i++) {
            comparisonChars1[i] = comparisonChars1[i].toLowerCase();
            comparisonChars2[i] = comparisonChars2[i].toLowerCase();
        }

        Arrays.sort(comparisonChars1);
        Arrays.sort(comparisonChars2);

        String comparisonString1 = String.join("", comparisonChars1);
        String comparisonString2 = String.join("", comparisonChars2);

        return comparisonString1.equals(comparisonString2);
    }

    public static void main(String[] args) {
        String a1 = "deco";
        String a2 = "code";

        String b1 = "last";
        String b2 = "nope";

        String c1 = "Louis Friend";
        String c2 = "iron sulfide";

        String d1 = "funeral";
        String d2 = "real fun";

        String e1 = "forty-five";
        String e2 = "over fifty";

        String f1 = "Tom Marvolo Riddle";
        String f2 = "I am Lord Voldemort";

        String g1 = "gentleman";
        String g2 = "elegent man";

        System.out.printf("\"%s\" is an anagram of \"%s\": %s%n", a1, a2, isAnagram(a1, a2)); // true
        System.out.printf("\"%s\" is an anagram of \"%s\": %s%n", b1, b2, isAnagram(b1, b2)); // false
        System.out.printf("\"%s\" is an anagram of \"%s\": %s%n", c1, c2, isAnagram(c1, c2)); // true
        System.out.printf("\"%s\" is an anagram of \"%s\": %s%n", d1, d2, isAnagram(d1, d2)); // true
        System.out.printf("\"%s\" is an anagram of \"%s\": %s%n", e1, e2, isAnagram(e1, e2)); // true
        System.out.printf("\"%s\" is an anagram of \"%s\": %s%n", f1, f2, isAnagram(f1, f2)); // true
        System.out.printf("\"%s\" is an anagram of \"%s\": %s%n", g1, g2, isAnagram(g1, g2)); // false
    }
}
