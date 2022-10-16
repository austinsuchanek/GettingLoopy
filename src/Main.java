import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        for(int cnt = 0; cnt <= 30; cnt ++)
        {
            System.out.println(cnt);
        }

        for(int cnt = 30; cnt >= 0; cnt --)
        {
            System.out.println(cnt);
        }

        for(int cnt = 0; cnt <= 18; cnt = cnt + 3)
        {
            System.out.println(cnt);
        }

        for(int cnt = 10; cnt >= 0; cnt = cnt - 2)
        {
            System.out.println(cnt);
        }

        for(int r = 1; r <= 5; r++)
        {
            for(int c = 1; c <= 5; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int r = 1; r <= 5; r++)
        {
            for(int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int r = 5; r >= 1; r--)
        {
            for(int c = 1; c <= r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}