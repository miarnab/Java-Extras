import java.io.*;
class sumevenodd
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number");
int n=Integer.parseInt(br.readLine());
int i,s=0,s1=0;
for(i=0;i<=n;i++)
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
System.out.println("Sum of even numbers is"+s);
System.out.println("Sum of odd numbers is"+s1);
}
}

