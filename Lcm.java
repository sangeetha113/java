import java.util.*;
class Lcm
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
        int lcm=(x*y)/gcd;
            
        
        System.out.println(lcm+" ");
    }
}
