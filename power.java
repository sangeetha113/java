import java.util.Scanner;
class power
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int p=s.nextInt();
int res=1;
if(n>=0&&p==0)
{
res=1;
}
else if(n==0&&p>=1)
{
res=0;
}
else
{
for(int i=1;i<=p;i++)
{
res=res*n;
}
System.out.println(n+"^"+p+"="+res);
}
}
