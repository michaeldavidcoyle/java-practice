package masterclass.collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] items = {"apples", "peaches", "milk", "eggs"};

        List<String> list = List.of(items); // returns immutable list
        System.out.println(list);
        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("chicken");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("potatoes", "pickles", "celery", "onion", "mustard", "mayo")
        );
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        // .get retrieves element by index
        System.out.println("Third item is " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard.");
        }

        groceries.add("peaches");
        System.out.println(groceries.indexOf("peaches")); // 1
        System.out.println(groceries.indexOf("oil")); // -1
        System.out.println(groceries.lastIndexOf("peaches")); // 11

        System.out.println(groceries);
        groceries.remove(3); // remove by index
        System.out.println(groceries);
        groceries.remove("peaches"); // remove by matching element
        System.out.println(groceries);

        // deletes each element on passed list
        groceries.removeAll(List.of("apples", "onion"));
        System.out.println(groceries);

        // removes all elements except those on passed list
        groceries.retainAll(List.of("milk", "pickles", "celery", "peaches"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "peaches", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "milk", "mustard", "salami"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceriesArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceriesArray));
    }
}
