import java.io.*;
class pattern
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
int i,j,k;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" "+i+" ");
}
System.out.println();
}
}
}