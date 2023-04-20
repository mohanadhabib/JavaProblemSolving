/*
A Program That Simulate the
Rock , Paper , Scissors Game
*/

public class RockPaperScissors {

    public static String rps(String playerOne,String playerTwo){
        String res = "";
        switch (playerOne) {
            case "rock", "Rock" -> {
                if (playerTwo.equals("paper") || playerTwo.equals("Paper")) {
                    res = "Player 2 Wins";
                } else if (playerTwo.equals("scissors") || playerTwo.equals("Scissors")) {
                    res = "Player 1 Wins";
                } else {
                    res = "TIE";
                }
            }
            case "paper", "Paper" -> {
                if (playerTwo.equals("rock") || playerTwo.equals("Rock")) {
                    res = "Player 1 Wins";
                } else if (playerTwo.equals("scissors") || playerTwo.equals("Scissors")) {
                    res = "Player 2 Wins";
                } else {
                    res = "TIE";
                }
            }
            case "scissors", "Scissors" -> {
                if (playerTwo.equals("rock") || playerTwo.equals("Rock")) {
                    res = "Player 2 Wins";
                } else if (playerTwo.equals("paper") || playerTwo.equals("Paper")) {
                    res = "Player 1 Wins";
                } else {
                    res = "TIE";
                }
            }
        }
        return res;
    }

    public static void main(String []args){
        System.out.println(rps("rock", "paper"));          // Player 2 Wins
        System.out.println(rps("paper", "rock"));          // Player 1 Wins
        System.out.println(rps("paper", "scissors"));      // Player 2 Wins
        System.out.println(rps("scissors", "scissors") );  // TIE
        System.out.println(rps("scissors", "paper"));      // Player 1 Wins
    }
}
