package masterclass.controlFlow;

import java.util.Scanner;

public class UserInputChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntFromUser(int count) {
        int integer = 0;
        boolean isValidInt = false;
        do {
            System.out.println("Enter number #" + count + ": ");
            try {
                integer = Integer.parseInt(scanner.nextLine());
                isValidInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        } while (!isValidInt);

        return integer;
    }

    public static void main(String[] args) {
        int sum = 0;
        StringBuilder addends = new StringBuilder();
        for (int count = 1; count <= 5; count++) {
            int userAddend = getIntFromUser(count);
            sum += userAddend;

            addends.append(userAddend);
            addends.append(count < 5 ? " + " : " = ");
        }

        System.out.println(addends.toString() + sum);
    }
}
