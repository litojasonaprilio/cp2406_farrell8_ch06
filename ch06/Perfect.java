public class Perfect
{
    public static void main(String[] args)
    {
        final int MAX = 1000;
        for (int min = 1; min <= MAX; min++)
        {
            int sum = 0;
            for (int e = 1; e < min; e++)
            {
                if ((min % e) == 0)
                    sum += e;
            }
            if (sum == min)
                System.out.println(sum + " is a perfect number.");
        }
    }
}
