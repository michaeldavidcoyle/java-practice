public class Arrays {
    // store multiple values in a single reference variable
    // continuous sequential block of memory
    // elements accessed by zero-based index
    // all values must be same data type
    public static void main(String[] args) {
        int[] integers = new int[5];
        // first index is 0
        integers[0] = 42;
        // last index is 1 less than the array length
        integers[4] = 100;
        // integers[5] = 10; // results in ArrayIndexOutOfBoundsException
        System.out.println(integers[4]);

        // array initializer
        String[] words = {"apple", "ball", "cat"}; // length determined by the number of elements added

        // enhanced for loop
        for (String word: words) {
            System.out.println(word);
        }
    }
}
