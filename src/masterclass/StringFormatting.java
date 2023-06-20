package masterclass;

public class StringFormatting {
    public static void main(String[] args) {
        System.out.println("String formatting: ");

        // string concatenation method
        String bulletList = "Print a bulleted list: \n" +
                "\t• First point\n" +
                "\t\t• Sub point\n" +
                "\t• Second point\n" +
                "\t• Third point\n";
        System.out.println(bulletList);

        // text block: starts and ends with 3 double quotes which must be on their own line
        String textBlock = """
                Print a bulleted list:
                    • First Point
                        • Sub Point
                    • Second Point
                    • Third Point
                """;
        System.out.println(textBlock);

        int age = 36;
        // %d is placeholder for an int variable
        // %n is a platform-independent newline character (same as \n on most systems)
        System.out.printf("Your age is %d%n", age);

        int birthYear = 2023 - age;
        System.out.printf("Age = %d, birth year = %d%n", age, birthYear);

        // format specifiers
        // starts with % sign, ends with a conversion symbol and have multiple options between
        // %[argument_index$][flags][width][.precision]conversion
        // for example:
        // %d is used for decimal integer types: int, short and long
        // %f is used for decimal numbers: floats and doubles
        // see table at: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html

        double priceOfPeaches = 1d / 3d;
        // the specifier here, %.2f means a floating point number with 2 decimal places of precision
        System.out.printf("Peaches are $%.2f each.%n", priceOfPeaches); // Peaches are $0.33 each.

        for (int i = 1; i < 100000; i *= 10) {
            System.out.printf("Printing %d %n", i);
        }
        // prints left-aligned:
//        Printing 1
//        Printing 10
//        Printing 100
//        Printing 1000
//        Printing 10000

        for (int i = 1; i < 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }
        // %6d formats the ints with padding, so they are effectively right-aligned
//        Printing      1
//        Printing     10
//        Printing    100
//        Printing   1000
//        Printing  10000

        // String methods
        // static
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString); // Your age is 36

        // instance
        String ageMessage = "Your age is %d".formatted(age);
        System.out.println(ageMessage); // Your age is 36
    }
}
