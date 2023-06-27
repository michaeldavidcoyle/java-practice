package masterclass.collections.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysChallenge {
    public static void main(String[] args) {
        int[] unsortedIntegers = getRandomArray(5);
        System.out.println(Arrays.toString(unsortedIntegers));

        int[] descendingIntegers = sortDescending(Arrays.copyOf(unsortedIntegers, unsortedIntegers.length));
        System.out.println(Arrays.toString(descendingIntegers));
    }

    public static int[] sortDescending(int[] integers) {
        int[] ascending = Arrays.copyOf(integers, integers.length);
        Arrays.sort(ascending);

        int[] descending = new int[integers.length];
        for (int index = 0; index < ascending.length; index++) {
            descending[(descending.length - 1) - index] = ascending[index];
        }

        return descending;
    }

    public static int[] getRandomArray(int arrayLength) {
        Random random = new Random();
        int[] intArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = random.nextInt(1000);
        }

        return intArray;
    }
}
