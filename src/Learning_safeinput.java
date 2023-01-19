import java.util.Scanner;
public class Learning_safeinput {
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);

        String FirstName = "";
        String LastName = "";

        FirstName = SafeInput.getNonZeroLenString( UserInput, "What Your First Name");

        LastName = SafeInput.getNonZeroLenString(UserInput, "Whats your Last Name");


        System.out.println("Name: " + FirstName +" " + LastName);



    }
}
///Get Int


