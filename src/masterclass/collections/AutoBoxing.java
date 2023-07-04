package masterclass.collections;

import java.util.Arrays;
import java.util.LinkedList;

public class AutoBoxing {
    public static void main(String[] args) {
        // ArrayList and LinkedList do not support primitive types
        // LinkedList<int> integerList = new LinkedList<>(); // will not compile
        // A wrapper class must be used, called "boxing"
        Integer boxedInt = Integer.valueOf(15);
        // alternatively (preferred)
        Integer autoBoxedInt = 15;
        // unboxing
        int unboxed = boxedInt.intValue();
        // auto-unboxing (preferred)
        int autoUnboxed = autoBoxedInt;

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));
        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));
    }
}
