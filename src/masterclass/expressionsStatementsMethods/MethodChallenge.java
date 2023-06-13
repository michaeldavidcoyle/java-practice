package masterclass.expressionsStatementsMethods;

public class MethodChallenge {
    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " achieved position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }

        return position;
    }

    public static void main(String[] args) {
        String[] playerNames = {"Bob", "Mary", "Jerry", "James", "Sally"};
        int[] scores = {1500, 1000, 500, 100, 25};

        for (int index = 0; index < playerNames.length; index++) {
            int position = calculateHighScorePosition(scores[index]);
            displayHighScorePosition(playerNames[index], position);
        }
    }
}
