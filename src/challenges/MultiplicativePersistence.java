package challenges;

/*
 * Write a function that takes a number and returns its multiplicative persistence, which is the number of times you can
 * multiply the digits in the number given until you can reach a single digit.
 * Examples:
 * Input: 123 | Output: 1
 * Input: 976342186 | Output: 3
 */
public class MultiplicativePersistence {
    public static long multiplyDigits(long n) {
        String[] digits = Long.toString(n).split("");
        long product = 1L;
        for (String digit : digits) {
            product *= Long.parseLong(digit);
        }

        return product;
    }

    public static int persistence(long n) {
        int count = 0;
        while (Long.toString(n).length() > 1) {
            n = multiplyDigits(n);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        long[] multiPersistTestLongs = {
            123L,
            976342186L,
            6788L,
            26888999L,
            277777788888899L
        };

        for (long testLong : multiPersistTestLongs) {
            System.out.println(persistence(testLong)); // 1, 3, 6, 9, 11
        }
    }
}
