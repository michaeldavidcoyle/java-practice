package challenges;

import java.util.Arrays;
import java.util.regex.Pattern;

public class CapitalIndices {
    /*
    * Write a function that takes a single string as its argument and returns an ordered list of the indexes of all
    * capital letters in the string. Assume that all input will have at least one capital letter.
    * Example:
    * Input: HelLO | Output:0,3,4
    * Input: codinG | Output: 5
    */

    private static boolean isCapital(CharSequence ch) {
        Pattern capital = Pattern.compile("^[A-Z]$");
        return capital.matcher(ch).matches();
    }

    private static int[] getIndices(String string) {
        int total = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isCapital("" + string.charAt(i)) ) total++;
        }

        int[] indices = new int[total];
        int index = 0;
        for (int i = 0; i < string.length(); i++) {
            if (isCapital("" + string.charAt(i)) ) {
                indices[index++] = i;
            }
        }

        return indices;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getIndices("HelLO")));
        System.out.println(Arrays.toString(getIndices("codinG")));
        System.out.println(Arrays.toString(getIndices("Michael Coyle")));
        System.out.println(Arrays.toString(getIndices("lMnOp")));
        System.out.println(Arrays.toString(getIndices("unCopyRightAble")));
    }
}
