public class ADVPrintF {
    public static void main(String[] args)
    {
        for (int i = 0; i <= 23; i ++)
        {
            System.out.printf("%d5%7d\n",i,squareIt(i));
        }
    }
    private static int squareIt(int base)
    {
        return base * base;
    }
}

class test
{
    public static void main(String[] args) {
        for (int x = 1; x <= 20;x++){
           // System.out.printf("%d5%7d\n",x,squareIt(x));
           // System.out.printf("%-10s%-5s%15s%10s\n", "CAlvin", "astName", "Grade", "Gender");

        }
    }
    private static int squareIt(int base)
    {
        return base * base;
    }
}

//        System.out.printf("%-10s%-5s%15s%10s\n", FirstName, LastName, Grade, Gender);
