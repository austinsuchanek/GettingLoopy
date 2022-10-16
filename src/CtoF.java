import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {



        Scanner in = new Scanner(System.in);
        boolean done = false;
        double fahren = 0;
        double Cels = 0;
        String trash = "";



        done = false;

        do {
            System.out.print("What is your temperature in celsius?: ");


            if (in.hasNextDouble())
            {
                Cels = in.nextDouble();
                in.nextLine();
                fahren = (Cels * 1.8) + 32;
                System.out.print("Your temperature in fahrenheit ie " + fahren);
                done = true;
            }

            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number!");
            }

        }while (!done);
    }
}