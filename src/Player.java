import java.util.Random;

public class Player {
    public int position;
    public int turn;

    public Player() {
        turn = 0; //To measure which player's turn it is
    }

    public int rollDice() {
        return new Random().nextInt(6) + 1; //Random number between 1 to 6
    }

    public void checkOption(int dice) {
        int check = new Random().nextInt(3);

        switch (check) {

            case 0:
                // No play: Stay in place
                turn = 0;
                break;
            case 1:
                // Ladder: Move up by dice and take another turn
                turn = 1;
                if (position + dice > 100) {
                    break;
                } else {
                    position = position + dice;
                }
                break;
            case 2:
                // Snake: Move down by dice
                turn = 0;
                if (position - dice <= 0)
                    position = 0;
                else {
                    position = position - dice;
                }
                break;

        }

    }

}