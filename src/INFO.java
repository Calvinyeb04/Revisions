import java.util.Scanner;
public class INFO {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        String FirstName;
        String LastName;
        String Grade;
        String Gender;


        System.out.println("Enter First Name");
        FirstName = UserInput.nextLine();
        System.out.println("Enter Last Name");
        LastName = UserInput.nextLine();
        System.out.println("Enter Your Grade");
        Grade = UserInput.nextLine();
        System.out.println("Enter Gender");
        Gender = UserInput.nextLine();


        System.out.printf("%-10s%-5s%15s%10s\n", FirstName, LastName, Grade, Gender);
        System.out.printf("%-10s%-5s%15s%10s\n", FirstName, LastName, Grade, Gender);
        System.out.printf("%-10s%-5s%15s%10s\n", FirstName, LastName, Grade, Gender);
        System.out.printf("%-10s%-5s%15s%10sj\n", FirstName, LastName, Grade, Gender);

    }
}
///%-10s%-20s%5d%10.2f\n
