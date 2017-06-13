import java.util.*;
class Hcf
{
    public static void main(String args[])
    {
        int r;
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int x,y;
        x=n1;
        y=n2;
        while(n2>0)
        {
        r=n1%n2;
            n1=n2;
            n2=r;
        }
            int gcd=n1;
            
        
        System.out.println(gcd+" ");
    }
}
