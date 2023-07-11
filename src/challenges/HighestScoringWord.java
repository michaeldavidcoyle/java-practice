package challenges;

import java.util.HashMap;

public class HighestScoringWord {
    /*
    * Given a string of words, find the highest scoring word. Each letter of the word has a score corresponding to its
    * place in the alphabet (a = 1, b = 2, c = 3, …, z = 26). If two words have the same score, return the word that
    * comes first in the string. All letters will be lowercase, all inputs will be valid.
    * Example:
    * Input: two toads talking | Output: talking
    */

    private static int scoreWord(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += word.codePointAt(i) - 96;
        }
        return score;
    }

    private static int highestScoringWordIndex(String string) {
        int maxScore = 0;
        int index = 0;
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int wordScore = scoreWord(word);
            if (wordScore > maxScore) {
                maxScore = wordScore;
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "two toads talking",
                "round the rugged rocks",
                "are zebras black with white stripes or white with black stripes",
                "zachary struck it rich",
                "white walls yellowed by time"
        };

        for (String testString : testStrings) {
            String[] words = testString.split(" ");
            String highestWord = words[highestScoringWordIndex(testString)];
            for (String word : words) {
                System.out.printf("(%s: %d), ", word, scoreWord(word));
            }
            System.out.printf("Highest Scoring Word: %s%n", highestWord);
        }
    }
}
