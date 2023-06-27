package masterclass.collections.arrays;

import java.util.Arrays;
import java.util.Random;

public class JavaArrays {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        // Arrays.toString returns a string representation of the contents of the specified array
        System.out.println(Arrays.toString(firstArray));
        // Sorts the specified array into ascending numerical order
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        // Assigns the specified int value to each element of the specified array of ints
        Arrays.fill(secondArray, 3);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        // Copies the specified array, truncating or padding with zeros (if necessary) so the copy has the specified length
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

        String[] names = {"Charles", "Sally", "David", "Alice", "Bob"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        if (Arrays.binarySearch(names,"David") >= 0) {
            System.out.println("Found David in the list.");
        }

        int[] digits1 = {1, 2, 3, 4, 5};
        int[] digits2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(digits1, digits2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are NOT equal.");
        }

    }

    public static int[] getRandomArray(int arrayLength) {
        Random random = new Random();
        int[] intArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = random.nextInt(100);
        }

        return intArray;
    }
}
