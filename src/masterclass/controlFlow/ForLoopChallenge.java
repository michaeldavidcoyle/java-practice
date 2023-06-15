package masterclass.controlFlow;

public class ForLoopChallenge {
    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }

    public static boolean isPrime(int integer) {
        if (integer <= 2) {
            return integer == 2;
        }

        int sqrt = (int) Math.sqrt(integer);

        for (int factor = 3; factor <= sqrt; factor += 2) {
            if (integer % factor == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interest = calculateInterest(100.0, rate);
            System.out.println("$100 at " + rate + "% interest is $" + interest);
        }

        int primeCount = 0;
        for (int integer = 31; integer <= 100; integer += 2) {
//          alternative demonstrated by instructor:
//        for (int integer = 31; primeCount < 3 && integer <= 100; integer += 2) {
            if (isPrime(integer)) {
                System.out.println(integer + " is a prime number");
                primeCount++;
            }

            if (primeCount >= 3) break;
        }

        int sumOfFactors = 0;
        int factorCount = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sumOfFactors += i;
                System.out.println(i + " is divisible by 3 and 5");
                factorCount++;
            }

            if (factorCount == 5) break;
        }

        System.out.println("Sum of factors: " + sumOfFactors);
    }
}
