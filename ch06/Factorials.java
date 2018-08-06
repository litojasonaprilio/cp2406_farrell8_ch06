public class Factorials
{
    public static void main(String[] args)
    {
        final int MIN = 1;
        final int MAX = 10;
        int factorial;

        for (int i = MIN; i <= MAX; i++)
        {
            factorial = i;
            for (int j = i - 1; j > 0; --j)
            {
                factorial *= j;
            }
            System.out.println(i + " factorial is " + factorial + ".");
        }
    }
}
