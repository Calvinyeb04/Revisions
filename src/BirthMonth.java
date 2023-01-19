import java.util.Scanner;
public class BirthMonth {
    public static void main(String[] args)
    {
        Scanner Userinput = new Scanner(System.in);

        int BirthMonth = 1;
        int Range = 12;




            System.out.println("Enter Your BirthMonth");
        BirthMonth  = Userinput.nextInt();
        if (BirthMonth > Range)
            System.out.println("You entered an incorrect month value: " + BirthMonth);

        else
        System.out.println("Birth Month: " + BirthMonth);



    }
}

///Task 2 (5 pts):
//Project name:  Lab_05_02_BirthMonth
//
//A program that asks the user to enter their birth month (integer 1 – 12 inclusive). If the user enters a value in range,
// the program echoes the input (“Your birth month is: N”) If the value is not in the range it outputs an error msg (“You entered an incorrect month value: N”).   Here N should be the value they entered.
//
//Test runs:   (insert the output widow copies here for the test runs
//
//- valid input in range 1 - 12
//
//- invalid input out of range