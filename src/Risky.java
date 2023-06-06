// exceptions
//     * reading a corrupted file
//     * network connection failure
//     * division by zero
//     * calling method without an object
//     * exception types:
//         + IOException
//         + ConnectionException
//         + ArithmeticException
//         + NullPointerException

//     ------Throwable-------
//    |                      |
//  Error                Exception --> checked
//                           |       (must be handled or code won't compile)
//                           |
//                    RuntimeException
//                           |
//                        unchecked (occurs @ runtime)

import java.io.FileInputStream;

public class Risky {
    public static void main(String[] args) {
        // unchecked exceptions - will still compile
        int x = 1 / 0; // ArithmeticException
        Object object = null;
        object.toString(); // NullPointerException
        int[] intArray = new int[5];
        intArray[10] = 10; // ArrayIndexOutOfBoundsException

        // checked exception - will NOT compile
        // Unhandled exception: java.io.FileNotFoundException
//        FileInputStream file = new FileInputStream("file.txt");
    }
}
