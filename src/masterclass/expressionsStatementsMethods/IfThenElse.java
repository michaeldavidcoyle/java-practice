package masterclass.expressionsStatementsMethods;

public class IfThenElse {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

        // challenge
        // set existing score variable to 10,000
        // set existing levelCompleted variable to 8
        // set existing bonus variable to 200
        // use same if condition to perform the same calculation and print out finalScore
        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

    }
}
