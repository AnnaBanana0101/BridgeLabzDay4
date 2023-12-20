public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Snakes and ladders!");

        //Two players
        Player player0 = new Player();
        Player player1 = new Player();

        int dice;    //Dice values
        int count=0; //Count of number of dice rolls totally

        while (player0.position != 100 && player1.position != 100) {

            // Player 0
            player0.turn=1;

            while(player0.turn!=0) {

                dice = player0.rollDice();
                count++;
                player0.checkOption(dice);
                //Show whose turn it is after a roll
                System.out.println("0: "+ player0.turn); 
                System.out.println("1: "+ player1.turn);
            } 

            System.out.println(" ");

            // Player 1
            player1.turn=1;

            while (player1.turn!=0) {

                dice = player1.rollDice();
                count++;
                player1.checkOption(dice);
                System.out.println("1: "+ player1.turn);
                System.out.println("0: "+ player0.turn);
            } 

            System.out.println(" ");

        }

        if (player0.position == 100)
            System.out.println("Player 0 Wins!");
        else if (player1.position == 100)
            System.out.println("Player 1 Wins!");

        System.out.println("Total dice rolls: "+count);
    }
}
