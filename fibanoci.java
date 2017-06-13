import java.util.*;
class fibanoci
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,c;
        c=a+b;
        System.out.println(a+"\n" +b);
    while(c<=n)
    {
        System.out.println(c);
        a=b;
        b=c;
        c=a+b;
        
    }
    
    }
}

