import java.util.Scanner;
class largest
{
  public static void main(String args[])
  {
    int a,b,c,large;
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    large=(a>b)?(a>c?a:c):(b>c?b:c);
    System.out.println(large);
  }
}
