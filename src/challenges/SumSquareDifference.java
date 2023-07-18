package challenges;

public class SumSquareDifference {
    /*
    * Sum Square Difference
    * The sum of the squares of the first ten natural numbers is,
    * 1^2 + 2^2 + ... + 10^2 = 385
    * The square of the sum of the first ten natural numbers is,
    * (1 + 2 + ... + 10)^2 = 552 = 3025
    * Hence the difference between the sum of the squares of the
    * first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    */

    public static void main(String[] args) {
        int sumOfSquares = 0;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
            sum += i;
        }
        int squareOfSum = (int) Math.pow(sum, 2);
        System.out.printf(
                "The sum of the squares of the first one hundred natural numbers is %,d and the square of the sum is %,d%n",
                sumOfSquares,
                squareOfSum
        );
        System.out.printf("The difference between them is %,d", squareOfSum - sumOfSquares);
    }
}
