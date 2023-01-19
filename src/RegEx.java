import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {
    public static String getRegExString(Scanner sc, String prompt, String regEx) {
        String input = "";
        boolean validInput = false;
        Pattern pattern = Pattern.compile(regEx);
        while (!validInput) {
            System.out.print(prompt + ": ");
            input = sc.next();
            if (pattern.matcher(input).matches()) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please match the given pattern.");
            }
        }
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = getRegExString(sc, "Enter email", "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        System.out.println("Your email is: " + email);
    }
}
