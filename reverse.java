import java.util.*;
class reverse
{
    public static void main(String args[])
    {
        int m;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0)
        {
            m=n%10;
            System.out.print(m);
            n=n/10;
        }
    }
}
