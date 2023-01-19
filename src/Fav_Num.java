import java.util.Scanner;
public class Fav_Num {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        double price = 0.0;
        double tax;
        double total;

        while (true) {

            System.out.println("Enter The Item Price:");

            try {

                price = Double.parseDouble(UserInput.nextLine());

                tax = price * 0.05;
                total = price + tax;
                System.out.println("Total: " + total);
                break;
            } catch (NumberFormatException e) {

                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}


//a.	Task 1 (2 pts): a program where the user enters the price of a purchase and the program computes and outputs a
// 5% sales tax.  Don’t forget the prompt!