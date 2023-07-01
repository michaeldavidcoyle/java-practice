package masterclass.collections.lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        // using var keyword
        var otherPlaces = new LinkedList<String>();

        placesToVisit.add("The Alamo");
        placesToVisit.add(0, "Institute of Texan Cultures");

        System.out.println(placesToVisit);

        placesToVisit.addFirst("San Antonio Museum of Art");
        placesToVisit.addLast("Witte Museum");

        System.out.println(placesToVisit);

        // Queue methods
        placesToVisit.offer("San Antonio Zoo"); // adds to the end
        placesToVisit.offerFirst("McNay Museum of Art");
        placesToVisit.offerLast("Tower of the Americas");

        // Stack methods
        placesToVisit.push("River Walk");

        System.out.println(placesToVisit);

        placesToVisit.remove(4);
        placesToVisit.remove("San Antonio Zoo");

        System.out.println(placesToVisit);

        String removedPlace = placesToVisit.remove();
        System.out.println(removedPlace + " was removed");

        String firstRemoved = placesToVisit.removeFirst();
        System.out.println(firstRemoved + " was removed");

        String lastRemoved = placesToVisit.removeLast();
        System.out.println(lastRemoved + " was removed");

        // Queue poll methods
        String poll1 = placesToVisit.poll();
        System.out.println(poll1 + " was removed");
        String poll2 = placesToVisit.pollFirst();
        System.out.println(poll2 + " was removed");
        String poll3 = placesToVisit.pollLast();
        System.out.println(poll3 + " was removed");

        placesToVisit.push("The Alamo");
        placesToVisit.push("McNay Museum of Art");
        placesToVisit.push("Institute of Texan Cultures");
        placesToVisit.push("San Antonio Zoo");
        placesToVisit.push("River Walk");

        System.out.println(placesToVisit);

        String popped = placesToVisit.pop(); // remove first element
        System.out.println(popped + " was removed");

        System.out.println("retrieved element: " + placesToVisit.get(2));
        System.out.println("first element: " + placesToVisit.getFirst());
        System.out.println("last element: " + placesToVisit.getLast());

        System.out.println("Institute of Texan Cultures is at index " + placesToVisit.indexOf("Institute of Texan Cultures"));
        System.out.println("The Alamo is at index " + placesToVisit.lastIndexOf("The Alamo"));

        // Queue retrieval method
        System.out.println("Element from element(): " + placesToVisit.element());

        // Stack retrieval methods
        System.out.println("element from peek() -> " + placesToVisit.peek());
        System.out.println("element from peekFirst() -> " + placesToVisit.peekFirst());
        System.out.println("element from peekLast() -> " + placesToVisit.peekLast());

        System.out.println("Tour starts at " + placesToVisit.getFirst());
        String previousStop = placesToVisit.getFirst();
        ListIterator<String> iterator = placesToVisit.listIterator(1); // starting at 1, not 0, to avoid duplication
        while (iterator.hasNext()) {
            var stop = iterator.next();
            System.out.println("--> From: " + previousStop + " to " + stop);
            previousStop = stop;
        }
        System.out.println("Tour ends at " + placesToVisit.getLast());
    }
}
