import java.io.*;
class sumevenodd
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
System.out.println("Enter the first term");
int a=Integer.parseInt(br.readLine());
int i,s=0,s1=0;
for(i=a;i<=n;i++)
{
if(i%2==0)
{
s=s+i;
}
else
{
s1=s1+i;
}
}
System.out.println("The sum of the even numbers is"+s);
System.out.println("The sum of the odd numbers is"+s1);
}
}