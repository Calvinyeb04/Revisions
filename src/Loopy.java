public class Loopy {
    public static void main(String[] args) {
        for (int i = 0; i <= 19; i ++ )
        {
            System.out.println(i);
        }
    }
}


class Loopy2{
    public static void main(String[] args) {
        for (int cnt = 10; cnt >= 0; cnt = cnt - 2) {
            System.out.println(cnt);
        }
    }
}



class nestedloopy{
    public static void main(String[] args)
    {
        for (int i = 1;i <= 1; i ++){
            System.out.println("*");

            for (int X = 1;i <= 1; i ++){
                System.out.println("**");

                for (int C = 1; i <= 1; i ++)
                    System.out.println("***");

                for (int V = 1; V <= 1; V ++)
                    System.out.println("****");

                for (int B = 1; B <= 1; B ++)
                    System.out.println("*****");
            }
        }
    }



}


class Nestedloopy2{

    public static void main(String[] args) {
        for (int N =1; N >= 1; N --)
            System.out.println("*****");

        for (int Q =1;Q >= 1; Q--)
            System.out.println("****");

        for (int W =1; W >= 1; W --)
            System.out.println("***");

        for (int E = 1; E >= 1; E --)
            System.out.println("**");

        for (int R = 1; R >= 1; R--)
            System.out.println("*");
    }
}



