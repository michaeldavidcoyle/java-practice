package masterclass.collections.lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {
    public static void main(String[] args) {
        // complies but is bad practice
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk", "dairy");
        groceryArray[1] = new GroceryItem("apples", "produce", 6);
        // assigning a String instead of a GroceryItem is allowed because both are of type Object
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));

        // best practice
        GroceryItem[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem("milk", "dairy");
        groceryItems[1] = new GroceryItem("apples", "produce", 6);
        groceryItems[2] = new GroceryItem("oranges", "produce", 5);
        System.out.println(Arrays.toString(groceryItems));

        // likewise bad practice
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter", "dairy"));
        objectList.add("yogurt");

        // best practice
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("milk", "dairy"));
        groceryList.add(new GroceryItem("cheese", "dairy"));
        groceryList.add(new GroceryItem("peaches", "produce", 100));
        // overloaded add method, specifying the index of insertion
        groceryList.add(0, new GroceryItem("ham", "deli"));
        // set: replaces the element at the specified position in this list with the specified element
        groceryList.set(0, new GroceryItem("apples", "produce", 6));
        // deletes element at index
        groceryList.remove(1);
        System.out.println(groceryList);
    }
}

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name, String type) {
        this(name, type, 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name, type);
    }
}
