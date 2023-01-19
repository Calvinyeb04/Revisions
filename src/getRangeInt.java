import java.util.Scanner;
public class getRangeInt {
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);

        int Age = 0;
        int Requiment = 71;

        Age = SafeInput.getRangedInt(UserInput,"Enter Your Age", 21 , 70);
        if (Age <= Requiment )
        {
            System.out.println("Sorry You Don't Qualify");
        }

        else
        {
            System.out.println("Welcome , Hope You have a great time");
        }


    }
}
