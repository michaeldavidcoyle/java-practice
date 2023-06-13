package canvas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Declaring {
    public static void main(String[] args) {
        try {
            read();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("You don't need to see his identification. This is not the file you're looking for.");
        }
    }

    // declaring the exception
    static void read() throws FileNotFoundException { // passes handling of exception up the chain
        FileInputStream file = new FileInputStream("file.text");
    }
}
