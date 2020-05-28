import java.io.*;
class pattern3
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
int i,j;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("\t"+j);
}
System.out.println();
}
}
}