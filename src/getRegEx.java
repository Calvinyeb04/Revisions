import java.util.Scanner;
public class getRegEx {
    public static void main(String[] args)
    {
        Scanner UserInput = new Scanner(System.in);
        String IDNum;

        IDNum = SafeInput.getRegExString(UserInput, "What Is Your ID Number", "(M|m)\\d{8}");

        System.out.println("IDNUM: " +  UserInput);

    }
}
