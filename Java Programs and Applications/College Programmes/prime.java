import java.io.*;
class prime
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number");
int n=Integer.parseInt(br.readLine());
int i,c=0;
for(i=2;i<n;i++)
{
if(n%i==0)
{
c++;
}
}
if(c==0)
System.out.println("The number is a prime number");
else
System.out.println("The number is not a prime number");
}
}