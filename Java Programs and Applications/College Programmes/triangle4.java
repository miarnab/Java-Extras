import java.io.*;
class triangle4
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
System.out.print("   ");
}
for(k=1;k<=(n-i)+1;k++)
{
System.out.print(" * ");
}
System.out.println();
}
}
}