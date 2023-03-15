import java.util.Random;

public class CardBusters {
    public static void main(String[] args) {


        /*
        Setting up variables :
        Player One and Two cards and scores
        */

        int[] player1Cards = {10, 6, 8, 9, 7, 12, 7};
        int[] player2Cards = {7, 6, 9, 5, 2, 8, 11};

        int player1Score = 0;
        int player2Score = 0;

        // Printing game banner

        System.out.println("****************Play Card Busters !!!***************\n");

        // Main loop

        for (int i = 0; i < 7; i++) {

        // Picking random card for Player and Two respectively

            int ranIndexPl1 = new Random().nextInt(player1Cards.length);
            int ranIndexPl2 = new Random().nextInt(player2Cards.length);
            int player1Card = player1Cards[ranIndexPl1];
            int player2Card = player2Cards[ranIndexPl2];

        // Game logic to pick up winner for each round

            if (player1Card > player2Card) {
                System.out.print("Round No: " + (i+1) + "- ");

                System.out.print("Player 1 wins the round: " + player1Card+" beats "+player2Card);
                player1Score++;

            }
            else if (player2Card > player1Card) {
                System.out.print("Round No: " + (i+1) + "- ");

                System.out.print("Player 2 wins the round: " + player2Card+" beats "+player1Card);


                player2Score++;
            }
            else {
                System.out.print("Round No: " + (i+1) + "- ");
                System.out.print("Tie !! ");
                System.out.print(player1Card+" ties with "+player2Card);
            }
            System.out.println();
        }
        // Scores

        if (player1Score > player2Score) {
            System.out.println("Player One wins !! He won "+player1Score+" rounds beating Player Two who won "+player2Score+ " rounds!\n" );
        }
        else if (player2Score > player1Score) {
            System.out.println("Player Two wins !! He won "+player2Score+" rounds beating Player Two who won "+player1Score+ " rounds!\n" );
        }


        else {
            System.out.println("Game is tied! Player One won "+player1Score+" rounds and Player Two won "+player2Score+" rounds!\n");
        }
        System.out.println("Goodbye ! ");
    }
}
