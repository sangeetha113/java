import java.util.Scanner;
class leap
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
n=s=nextInt();
if(n%400==0)
{
System.out.println("leapYear");
}
else
{
System.out.println("not leapyear");
}
}
}
