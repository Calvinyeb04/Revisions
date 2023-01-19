import java.util.Scanner;
public class GetInt {
    public static void main(String[] args)
    {
     Scanner UerInput = new Scanner(System.in);

     int FavNum = 0;

      FavNum = SafeInput.getInt(UerInput,"Enter Your Fav Number");

        System.out.println("FavNum" + FavNum);
    }
}
