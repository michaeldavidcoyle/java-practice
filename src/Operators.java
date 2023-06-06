public class Operators {
    String instance = "var"; // = assignment operator

    public static void main(String[] args) {
        int local = 10; // assignment operator

        boolean bool = true;
        while (bool == true) { // == relational or comparison operator
            System.out.println("It's true, it's true.");
            bool = false; // assignment operator
        }

        // mathematical operators
        int add = 2 + 2;
        int subtract = 2 - 2;
        int multiply = 2 * 2;
        int divide = 2 / 2;
        int remainder = 2 % 2; // modulus (remainder of division)
        System.out.println(5 % 3); // 2

        // + operator also does string concatenation
        System.out.println("Hello" + "World");

        // comparison/relational operators
        boolean equalTo = 5 == 4; // false
        boolean notEqualTo = 5 != 4; // true
        boolean greaterThan = 5 > 4; // true
        boolean lessThan = 5 < 4; // false
        boolean greaterOrEqual = 5 >= 4; // true
        boolean lessOrEqual = 5 <= 4; // false

        // logical operators
        boolean holiday = false;
        boolean weekend = true;
        boolean work = false;

        if (holiday | weekend & !work) { // true
            System.out.println("It's my day off.");
        }

        holiday = true;
        weekend = false;
        // short-circuit
        if (holiday || weekend) { // since holiday is true, the next condition is never evaluated
            System.out.println("It's my day off (short-circuit).");
        }

        // increment operators
        int x = 0;
        // prefix: increment, then print
        System.out.println(++x); // 1
        // postfix: print, then increment
        System.out.println(x++); // prints 1 (current value) then increments (2)
        System.out.println(--x); // decrements, then prints 1
        System.out.println(x--); // prints 1, then decrements
        System.out.println(x); // 0
    }
}
