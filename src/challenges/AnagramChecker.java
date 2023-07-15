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
        System.out.println("deco is an anagram of code: " + isAnagram("deco", "code"));
        System.out.println("last is an anagram of nope: " + isAnagram("last", "nope"));
        System.out.println("Louis Friend is an anagram of iron sulfide: " + isAnagram("Louis Friend", "iron sulfide"));
    }
}
