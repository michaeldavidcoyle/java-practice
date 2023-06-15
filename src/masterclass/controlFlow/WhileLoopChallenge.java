package masterclass.controlFlow;

public class WhileLoopChallenge {
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int number = 5;
        int oddCount = 0;
        int evenCount = 0;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println(number);
                evenCount++;
            } else {
                oddCount++;
            }

            if (evenCount == 5) break;

            number++;
        }

        System.out.println("Found " + evenCount + " even numbers.");
        System.out.println("Found " + oddCount + " odd numbers.");
    }
}
