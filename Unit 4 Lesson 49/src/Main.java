public class Main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Alex", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Mike", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("David", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Joseph", highScorePosition);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println("Player " + name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
