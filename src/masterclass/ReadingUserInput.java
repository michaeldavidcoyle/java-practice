package masterclass;

import java.util.Scanner;

public class ReadingUserInput {
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Hi, what's your name? ");
        System.out.println("Hi, " + name + ", thanks for taking the course.");

        String dob = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dob);

        return "So you are " + age + " years old.";
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hi, what's your name? ");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + ", thanks for taking the course.");

        System.out.print("What year were you born? ");
        String dob = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dob);

        return "So you are " + age + " years old.";
    }

    public static void main(String[] args) {
        int currentYear = 2023;

        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }
}
