import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class TryCatch {
    static FileInputStream file;

    static void process() throws DataFormatException, ExecutionException {
        // some potentially risky code
    }

    public static void main(String[] args) {
        try {
            file = new FileInputStream("file.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            // recovery procedures
            // create file, then open it
            // log exception
            System.out.println("Oops, looks like we had trouble locating that file.");
        }

        try {
            process();
            // always go from more specific to general exceptions
//        } catch (Exception e) { // will not compile
        } catch (ExecutionException executionException) {
            System.out.println("Hmm, looks like something failed to execute.");
        } catch (DataFormatException dataFormatException) {
            System.out.println("Something's not quite right about that formatting.");
        }
        // two catch blacks can be combined if the same block can handle both
//         catch (ExecutionException | DataFormatException e) {
//             same code
//        }

        // these two catch blacks can be combined if the same block can handle both
    }
}
