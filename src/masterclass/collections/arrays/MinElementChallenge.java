package masterclass.collections.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {
    public static void main(String[] args) {
        int[] inputIntegers = readIntegers();
        System.out.println(Arrays.toString(inputIntegers));

        int min = findMin(inputIntegers);
        System.out.printf("Minimum integer is %d%n", min);
    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers separated by commas: ");
        String[] inputList = scanner.nextLine().split(",");
        int[] integers = new int[inputList.length];
        for (int i = 0; i < inputList.length; i++) {
            integers[i] = Integer.parseInt(inputList[i].trim());
        }

        return integers;
    }

    private static int findMin(int[] integers) {
        int min = Integer.MAX_VALUE;
        for (int integer : integers) {
            if (integer < min) min = integer;
        }

        return min;
    }
}
