public class CountByThrees
{
    public static void main(String[] args)
    {
        final int START = 3;
        final int FINISH = 300;
        final int COUNT = 3;
        final int STOPLINE = 30;
        int num;
        for (num = START; num <= FINISH; num += COUNT)
        {
            System.out.print(num + "  ");
            if (num % STOPLINE == 0)
                System.out.println();
        }
    }
}
