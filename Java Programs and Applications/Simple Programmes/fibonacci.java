import java.io.*;
class fibonacci
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number");
int n=Integer.parseInt(br.readLine());
int i,f,s,t;
f=0;
s=1;
System.out.println("\nThe Fibonacci Series is:");
System.out.print(f+"\t"+s);
for(i=2;i<=n;i++)
{
t=f+s;
System.out.print("\t"+t);
f=s;
s=t;
}
}
}
