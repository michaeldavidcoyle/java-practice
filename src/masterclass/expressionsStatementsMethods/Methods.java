package masterclass.expressionsStatementsMethods;

public class Methods {
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
        }

        return finalScore;
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println(
            "Your final score is " + calculateScore(gameOver, score, levelCompleted, bonus)
        );
    }
}
