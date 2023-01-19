import java.util.Scanner;

public class getYNReps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean confirm = SafeInput.getYNConfirm(sc, "Are you sure you want to proceed?");
        if (confirm) {
            // do something
        } else {
            // do something else
        }
    }
}