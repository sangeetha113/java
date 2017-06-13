import java.util.*;
class pali
{
    public static void main(String args[])
    {
        int m;
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int temp=n,sum=0;
        while(n>0)
        {
            m=n%10;
            sum=(sum*10)+m;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not an palindrome");
        }
    }
}
