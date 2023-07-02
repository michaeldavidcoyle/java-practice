package masterclass.collections.lists;

// Austin 80
// Houston 222
// Dallas 274
// Los Angeles 1352
// NY 1821
// DC 1601
// Boston 2042
// Chicago 1241
// Philly 1740

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListChallenge {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList<Place> stops = new LinkedList<>();
    private static ListIterator<Place> iterator;
    private static String actions = """
    Available actions (select word or letter):
    (F)orward
    (B)ackward
    (L)ist Places
    (M)enu
    (Q)uit
    """;

    private static void addPlace(Place place) {
        for (Place stop : stops) {
            if (stop.name().equalsIgnoreCase(place.name())) return;
        }

        int matchedIndex = 0;
        for (var listPlace : stops) {
            if (place.distance() < listPlace.distance()) {
                stops.add(matchedIndex, place);
                return;
            }

            matchedIndex++;
        }

        stops.add(place);
    }

    private static void forward() {
        if (iterator.hasNext()) {
            System.out.println("Next stop: " + iterator.next());
        } else {
            System.out.println("End of the line, must go backward or quit.");
        }
        System.out.println();
    }

    private static void backward() {
        if (iterator.hasPrevious()) {
            System.out.println("Previous stop: " + iterator.previous());
        } else {
            System.out.println("Origin of tour, must go forward or quit.");
        }
        System.out.println();
    }

    private static void listPlaces() {
        System.out.println(stops);
        System.out.println();
    }

    private static void printMenu() {
        System.out.print(actions);
    }

    public static void main(String[] args) {
        addPlace(new Place("Austin", 80));
        addPlace(new Place("Dallas", 274));
        addPlace(new Place("Los Angeles", 1352));
        addPlace(new Place("New York", 1821));
        addPlace(new Place("Washington, DC", 1601));
        addPlace(new Place("Boston", 2042));
        addPlace(new Place("Houston", 222));
        addPlace(new Place("Chicago", 1241));
        addPlace(new Place("Philadelphia", 1740));

        iterator = stops.listIterator(1);

        String selection;
        do {
            printMenu();
            selection = scanner.nextLine();
            switch (selection.toUpperCase()) {
                case "F" -> forward();
                case "B" -> backward();
                case "L" -> listPlaces();
                case "M" -> printMenu();
            }
        } while (!selection.equalsIgnoreCase("Q"));
    }
}

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}