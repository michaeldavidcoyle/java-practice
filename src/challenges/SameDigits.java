package challenges;

import java.util.Arrays;
import java.util.Collections;

public class SameDigits {
    /*
    * Given an integer parameter, write a function that will return the next greater number using the same digits.
    * Example:
    * Input: 230 | Output: 302
    */

    private static int nextIntegerWithSameDigits(int integer) {
        String[] digits = Integer.toString(integer).split("");
        Arrays.sort(digits, Collections.reverseOrder());
        int descendingDigits = Integer.parseInt(String.join("", digits));
        if (integer == descendingDigits) return integer;

        int nextInteger = integer + 1;
        while (!hasSameDigits(integer, nextInteger)) {
            nextInteger++;
        }

        return nextInteger;
    }

    private static boolean hasSameDigits(int integer1, int integer2) {
        String[] digits1 = Integer.toString(integer1).split("");
        String[] digits2 = Integer.toString(integer2).split("");
        if (digits1.length != digits2.length) return false;
        Arrays.sort(digits1);
        Arrays.sort(digits2);
        for (int i = 0; i < digits1.length; i++) {
            String digit1 = digits1[i];
            String digit2 = digits2[i];
            if (!digit1.equals(digit2)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] testIntegers = {
                24,
                230,
                1281,
                4510,
                49710,
                12345,
                54321,
                120_000,
                1_010_000,
                21_345_670
        };

        for (int integer : testIntegers) {
            System.out.println(integer + ": " + nextIntegerWithSameDigits(integer));
        }
    }
}
