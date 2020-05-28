import java.io.*;
class consnaturalno
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
int i;
for(i=1;i<=n;i++)
{
//To display consecutive natural numbers
System.out.println(i);
}
}
}