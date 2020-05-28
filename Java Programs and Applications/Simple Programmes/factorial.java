import java.io.*;
class factorial
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number");
int n=Integer.parseInt(br.readLine());
int i,f=1;
for(i=1;i<=n;i++)
{
f=f*i;
}
System.out.println("The factorial of the inputed number is"+f);
}
}

