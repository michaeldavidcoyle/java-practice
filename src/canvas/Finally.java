package canvas;// finally block
// runs after a try block regardless if an exception is thrown
// useful for closing resources like files, network or database connections, etc
// not to be confused with the final keyword

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        FileInputStream file = null;
        try {
            file = new FileInputStream("src/demo.txt");
            System.out.println((char) file.read());
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        } catch (IOException e) {
            System.out.println("IOException-read");
        } finally { // will always run
            System.out.println("finally");
            // look up try-with resources statement
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("IOException-close");
                }
            }
        }
    }
}
