public class DiagonalOs
{
    public static void main(String[] args)
    {
        final int MAX = 10;
        final String PATTERN = "O";
        final String SPACE = " ";

        for (int i = 0; i < MAX; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(SPACE);
            }
            System.out.println(PATTERN);
        }
    }
}
