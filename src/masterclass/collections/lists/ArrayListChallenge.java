package masterclass.collections.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] options = {
            "to shutdown",
            "to add item(s) to list (comma delimited list)",
            "to remove any items (comma delimited list)"
    };
    private static ArrayList<String> groceries = new ArrayList<>();

    private static void menu() {
        for (int index = 0; index < options.length; index++) {
            System.out.printf("%d - %s%n", index, options[index]);
        }
        System.out.print("Enter a number for the desired option: ");
    }

    private static int getUserChoice() {
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            return choice;
        } catch (NumberFormatException nfe) {
            return -1;
        }
    }

    private static String[] getItems(String addOrRemove) {
        if (!addOrRemove.equals("add") && !addOrRemove.equals("remove")) return new String[0];
        System.out.printf("Enter items to %s (separated by commas): %n", addOrRemove);
        String[] items = scanner.nextLine().split(",");
        for (int i = 0; i < items.length; i++) {
            items[i] = items[i].trim();
        }

        return items;
    }

    private static void addItems(String[] items) {
        for (String item : items) {
            if (!groceries.contains(item)) {
                groceries.add(item);
            }
        }
        printGroceries();
    }

    private static void removeItems(String[] items) {
        for (String item : items) {
            groceries.remove(item);
        }
        printGroceries();
    }

    private static void printGroceries() {
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        System.out.println("-".repeat(32));
    }

    public static void main(String[] args) {
        int selectedNumber;
        do {
            menu();
            selectedNumber = getUserChoice();

            String[] items;

            if (selectedNumber == 1) {
                items = getItems("add");
                addItems(items);
            } else if (selectedNumber == 2) {
                items = getItems("remove");
                removeItems(items);
            }
        } while (selectedNumber != 0);
    }
}
