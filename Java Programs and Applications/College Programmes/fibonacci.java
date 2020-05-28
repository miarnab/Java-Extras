import java.io.*;
class fibonacci
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
System.out.println("Enter the first and the second terms");
int f=Integer.parseInt(br.readLine());
int s=Integer.parseInt(br.readLine());
int i,t;
System.out.println("\nThe Fibonacci Series is:");
System.out.print(f+"\t"+s);
for(i=2;i<n;i++)
{
t=f+s;
System.out.print("\t"+t);
f=s;
s=t;
}
}
}
