package masterclass.collections.arrays;

import java.util.Arrays;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] intArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(intArray));
        reverse(intArray);
        System.out.println(Arrays.toString(intArray));

        int[] integers = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(reverseCopy(integers)));
    }

    private static int[] reverseCopy(int[] integers) {
        int[] reversedIntegers = new int[integers.length];
        int reverseIndex = reversedIntegers.length - 1;

        for (int integer : integers) {
            reversedIntegers[reverseIndex--] = integer;
        }

        return reversedIntegers;
    }

    private static void reverse(int[] integers) {
        int maxIndex = integers.length - 1;
        int halfIndex = integers.length / 2;

        for (int index = 0; index < halfIndex; index++) {
            int temp = integers[index];
            integers[index] = integers[maxIndex - index];
            integers[maxIndex - index] = temp;
        }
    }
}
