// LinkedList
// class in the Java Collections API
// linear series of nodes
// "linked" by a reference to the next node
// "doubly-lined", nodes have a previous and next reference
// allows duplicate elements
// preserves insertion order

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Olive> olives = new LinkedList<>();
        olives.add(new Olive("pimento"));
        olives.add(new Olive("garlic"));
        olives.add(new Olive("herb"));
        olives.addFirst(new Olive("jalepeño"));

        Olive firstOlive = olives.getFirst(); // returns first element
        Olive lastOlive = olives.getLast(); // returns first element

        int index = olives.indexOf(firstOlive); // Returns the index of the first occurrence of the specified element in
        // this list, or -1 if this list does not contain the element

        // Replaces the element at the specified position in this list with the specified element.
        olives.set(index, new Olive("anchovy"));

        // olives.clear(); // remove all elements

        for (Olive olive : olives) {
            System.out.println(olive.flavor);
        }
    }
}

class Olive {
    String flavor;

    public Olive(String flavor) {
        this.flavor = flavor;
    }
}