import java.util.Scanner;
public class Inbetween
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int diff;
        int i;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        num1 = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter the second integer: ");
        num2 = input2.nextInt();

        diff = num1 - num2;
        if (diff >= -1 && diff <= 1)
            System.out.println("There are no integers between the entered values.");
        else
            if (num1 < num2)
                for (i = num1; i <= num2; i++)
                    System.out.print(i + " ");
            else
                for (i = num2; i <= num1; i++)
                    System.out.print(i + " ");
    }
}
