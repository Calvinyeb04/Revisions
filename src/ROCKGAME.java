import java.util.Scanner;
public class ROCKGAME {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        String R = "ROCK";
        String P = "Paper";
        String S = "Scissors";
        String Player1;
        String Player2;


        System.out.println("Welcome To This Game. There Are Two Players In This Game");

        System.out.println("Player One: (R,P,S)");
        Player1 = UserInput.nextLine();

        System.out.println("Player One: " + Player1);

        System.out.println("Player Two: (R,P,S");
        Player2 = UserInput.nextLine();

        System.out.println("Player Two: " + Player2);

        if (Player1.equalsIgnoreCase(Player2))
            System.out.println("Its a Tie");

        if (Player1.equalsIgnoreCase(R) && Player2.equalsIgnoreCase(P))
            System.out.println("Player 2 Wins");


    }}


///1.	Code the Rock Paper Scissors program:
//a.	Get a move choice from playerA which must be R, P, S or r, p, s
//Loop until you get a valid move
//b.	Get a move choice from playerB in the same manner
//c.	Display the results using the accepted phrases from the game
//Rock breaks Scissors,
//Paper covers Rock,
//Scissors cuts Paper
//and indicate the winner (Player A wins) or
//Rock vs Rock it’s a Tie!  Etc…
//d.	Prompt the user to play again [Y/N]
//e.	Continue or terminate based on the user’s choice.
