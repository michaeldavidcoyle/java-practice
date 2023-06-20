package masterclass;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("String Inspection Methods:");
        /*
         * String inspection methods:
         *     length => returns number of characters in the string
         *     charAt => returns the character at the passed index
         *     indexOf => returns the integer index of the first matching passed char or string
         *     lastIndexOf => returns the integer index of the last matching passed char or string
         *     isEmpty => returns boolean based on length of string == 0
         *     isBlank => returns true if length is 0 OR string contains only whitespace, added in JDK 11
         */

        printStringInfo("Hello World");
        printStringInfo("");
        printStringInfo("\t   \n");

        // indexOf is overloaded, taking either a char or a string
        String hello = "Hello World";
        System.out.printf("index of 'r': %d%n", hello.indexOf('r'));
        System.out.printf("index of \"World\": %d%n", hello.indexOf("World"));

        // indexOf vs lastIndexOf
        System.out.printf("index of 'l': %d%n", hello.indexOf('l'));
        System.out.printf("last index of 'l': %d%n", hello.lastIndexOf('l'));
        System.out.println("-------------------------------------");

        System.out.println("String Comparison methods:");
        /*
        * String Comparison Methods:
        *     contains => returns a boolean if the string contains the argument passed
        *     startsWith => returns boolean based on condition that string begins with the passed argument
        *     endsWith => returns boolean based on condition that string ends with the passed argument
        *     regionMatches => returns boolean based on condition that defined sub-regions are matched
        */

        String helloLower = hello.toLowerCase();
        boolean stringsMatch = hello.equals(helloLower);
        if (stringsMatch) {
            System.out.println("Strings match exactly.");
        } else {
            System.out.println("Strings do NOT match.");
        }

        stringsMatch = hello.equalsIgnoreCase(helloLower);
        if (stringsMatch) {
            System.out.println("Strings match, ignoring case.");
        }

        if (hello.startsWith("Hello")) {
            System.out.println("String starts with \"Hello\"");
        }

        if (hello.endsWith("World")) {
            System.out.println("String ends with \"World\"");
        }

        if (hello.contains("World")) {
            System.out.println("String contains \"World\"");
        }

        if (hello.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }

        System.out.println("-".repeat(24));

        System.out.println("String Manipulation Methods");

        /*
        * String Manipulation Methods
        *     "clean up" methods
        *         indent => adds or removes spaces from the beginning of lines in multi-line text
        *         strip => removes whitespace
        *             * the difference between strip and trim is that strip supports a larger set of whitespace characters
        *             * added JDK 11
        *         stripLeading => removes whitespace
        *             * added JDK 11
        *         stripTrailing => removes whitespace
        *             * added JDK 11
        *         trim => removes whitespace
        *         toLowerCase => returns new string in all lower case
        *         toUpperCase => returns new string in all upper case
        *     methods that transform string value
        *         concat => similar to the + operator, concatenates passed values to the instance string and return new string
        *         join => concatenates multiple strings together in a single method, specifying a delimiter
        *         repeat => returns the string repeated by the number of times passed in the argument
        *         replace => returns new string with specified characters replaced
        *         replaceAll => returns new string with specified characters replaced
        *         replaceFirst => returns new string with specified characters replaced
        *         substring => returns part of a string, its range defined by start and end index arguments
        *         subSequence => returns part of a string, its range defined by start and end index arguments
        */

        String birthDate = "04-10-1974";
        int startIndex = birthDate.indexOf("1974");
        System.out.println("startIndex = " + startIndex);
        System.out.println("Birth year = " + birthDate.substring(startIndex));

        // print day of month
        System.out.println("Birth date = " + birthDate.substring(3, 5));

        // String.join
        String date = String.join("-", "12", "25", "1973");
        System.out.println("Date: " + date);

        // string.concat, also an example of method chaining
        date = "02".concat("-").concat("22").concat("-").concat("2003");
        System.out.println("Date: " + date);

        // replace
        System.out.println("replace: " + date.replace('-', '/'));
        System.out.println("replaceFirst: " + date.replaceFirst("-", "/"));
        System.out.println("replaceAll: " + date.replaceAll("-", "."));

        // repeat
        System.out.println("ABC\n".repeat(3));
        System.out.println("repeat: " + "-".repeat(24));

        // indent
        System.out.println("ABC\n".repeat(3).indent(4));
    }

    public static void printStringInfo(String string) {
        System.out.printf("Length: %d%n", string.length());

        // prevent against StringIndexOutOfBoundsException
        if (string.isEmpty()) {
            System.out.println("String is empty.");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank.");
        }

        System.out.printf("First char: %c%n", string.charAt(0));
        System.out.printf("Last char: %c%n", string.charAt(string.length() - 1));
    }
}
