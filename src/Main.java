import java.util.Scanner;

class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        String playA = "";
        String playB = "";

        while (playAgain) {
            // Get valid input for Player A
            do {
                System.out.print("Player A, enter your move (R, P, S): ");
                playA = scanner.nextLine().toUpperCase();
            } while (!isValidMove(playA));

            // Get valid input for Player B
            do {
                System.out.print("Player B, enter your move (R, P, S): ");
                playB = scanner.nextLine().toUpperCase();
            } while (!isValidMove(playB));


            if (playA.equalsIgnoreCase("R"))
            {
                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("It's a tie! Rock vs Rock");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers Rock. Player B wins!");
                }
                else
                {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            }
            else if (playA.equalsIgnoreCase("P"))
            {
                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers Rock. Player A wins!");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("It's a tie! Paper vs Paper");
                }
                else
                {
                    System.out.println("Scissors cuts Paper. Player B wins!");
                }
            }
            else
            {
                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts Paper. Player A wins!");
                }
                else
                {
                    System.out.println("It's a tie! Scissors vs Scissors");
                }
            }


            System.out.print("Do you want to play again? (Y/N): ");
            String response = scanner.nextLine().toUpperCase();
            playAgain = response.equals("Y");
        }
    }


    public static boolean isValidMove(String move) {
        return move.equalsIgnoreCase("R") || move.equalsIgnoreCase("P") || move.equalsIgnoreCase("S");
    }
}
