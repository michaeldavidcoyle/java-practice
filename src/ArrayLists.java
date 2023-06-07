// ArrayList
// class in Collections API in Java
// creates an array and provides methods for working with it
//     * default size is 16
// size of the array is mutable
// grows 50% larger to accommodate more elements
// allows duplicate elements
// preserves order insertion

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // type is specified in angle brackets
        // add method is overloaded: single arg is element to append, 2 args is index and element
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        // access
        System.out.println(list.get(2)); // c
        list.remove(3);
        int listSize = list.size();
        System.out.println("list is " + listSize + " items long"); // list is 3 items long
        System.out.println(list); // [a, b, c]

        for(String item : list) {
            System.out.println(item);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);    // adding an element
        numbers.add(0, 21); // specifying an index
        numbers.add(22);

        System.out.println(numbers); // [21, 20, 22]

        numbers.size(); // 3
        numbers.get(2); // 22

        numbers.indexOf(20);    // 1
        numbers.indexOf("cat"); // -1

        boolean hasNumber = numbers.contains(21);
        System.out.println("numbers list has 21: " + hasNumber);

        boolean listIsEmpty = list.isEmpty();
        System.out.println("list is empty: " + listIsEmpty);
    }
}
