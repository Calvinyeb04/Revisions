import java.util.Scanner;
public class SafeInputDemo {
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);

        int FavNum;


       // System.out.println("Enter Your Favorite Number?");

        FavNum= SafeInput.getRangedInt(UserInput, "Enter Your Favorite Number? ", 1,10);


        System.out.println("Your Favorite Number: " + FavNum) ;
    }
}
