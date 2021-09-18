/**
 * Created by George Ghandour 9/16                      #717654
 **/

public class DrawRocket
{
    public static int SIZE = 3;

    public static void main(String[] args)
    {
        printCone();
        printLine();
        printDownBox();
        printUpBox();
        printLine();
        printUpBox();
        printDownBox();
        printLine();
        printCone();
    }

    public static void printCone()
    {
        for (int i = 1; i <= 2 * SIZE - 1; i++)
        {
            for (int j = 1; j <= 2 * SIZE - i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++)
            {
                System.out.print("/");
            }

            System.out.print("*++*");


            for (int j = 1; j <= i; j++)
            {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

    public static void printLine()
    {
        System.out.print("**");
        for (int i = 0; i < 2 * SIZE; i++)
        {
            System.out.print("=+");
        }
        System.out.println("**");
    }

    public static void printUpBox()
    {
        for (int i = 1; i <= SIZE; i++)
        {
            System.out.print("||");

            for (int j = 1; j <= 2; j++)
            {
                for (int k = 1; k <= SIZE - i; k++)
                {
                    System.out.print(".");
                }

                for (int k = 1; k <= i; k++)
                {
                    System.out.print("/\\");
                }

                for (int k = 1; k <= SIZE - i; k++)
                {
                    System.out.print(".");
                }
            }

            System.out.println("||");
        }
    }

    public static void printDownBox()
    {
        for (int i = SIZE; i >= 1; i--)
        {
            System.out.print("||");

            for (int j = 1; j <= 2; j++)
            {
                for (int k = 1; k <= SIZE - i; k++)
                {
                    System.out.print(".");
                }

                for (int k = 1; k <= i; k++)
                {
                    System.out.print("\\/");
                }

                for (int k = 1; k <= SIZE - i; k++)
                {
                    System.out.print(".");
                }
            }

            System.out.println("||");
        }
    }
}