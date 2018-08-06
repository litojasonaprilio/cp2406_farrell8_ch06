import java.util.Scanner;
public class CountByAnything
{
    public static void main(String[] args)
    {
        final int STOPLINE = 10;
        int finish;
        int stopline;
        int count;
        int num;

        Scanner countInput = new Scanner(System.in);
        System.out.println("Enter the value to count by: ");
        count = countInput.nextInt();

        finish = count * 100;
        stopline = count * STOPLINE;

        for (num = count; num <= finish; num += count)
        {
            System.out.print(num + "  ");
            if (num % stopline == 0)
                System.out.println();
        }
    }
}
