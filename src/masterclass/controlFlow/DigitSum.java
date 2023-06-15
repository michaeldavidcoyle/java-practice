package masterclass.controlFlow;

public class DigitSum {
    public static int sumDigits(int number) {
        if (number < 0) return -1;

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int testInt1 = 7;
        int testInt2 = 26;
        int testInt3 = 531;
        int testInt4 = 10513;
        int testInt5 = 2_074_961_583;
        int testIntNeg = -253;
        System.out.println("Sum of the digits of " + testInt1 + " = " + sumDigits(testInt1));
        System.out.println("Sum of the digits of " + testInt2 + " = " + sumDigits(testInt2));
        System.out.println("Sum of the digits of " + testInt3 + " = " + sumDigits(testInt3));
        System.out.println("Sum of the digits of " + testInt4 + " = " + sumDigits(testInt4));
        System.out.println("Sum of the digits of " + testInt5 + " = " + sumDigits(testInt5));
        System.out.println("Sum of the digits of " + testIntNeg + " = " + sumDigits(testIntNeg));
    }
}
