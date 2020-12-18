public class Fakultaet
{
    public static void main(String[] args)
    {
        System.out.println(fakultaet(6));

    }

    private static int fakultaet(int n)
    {
        int i = 1;
        int result = 1;
        while(i < n)
        {
            result *= (++i);
        }
        return result;
    }

}
