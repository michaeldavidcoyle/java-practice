package masterclass.controlFlow;

import java.util.Scanner;

public class MinAndMaxChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double number;
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;

        while (true) {
            System.out.println("Enter number (any non-numeric key to quit): ");
            try {
                number = Double.parseDouble(scanner.nextLine());

                if (number > max) max = number;
                if (number < min) min = number;

                System.out.println("Minimum number entered: " + min);
                System.out.println("Maximum number entered: " + max);
            } catch (NumberFormatException e) {
                break;
            }
        }

        System.out.println("Goodbye");
    }
}
