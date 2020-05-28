import java.io.*;
class triangle1
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
int i,j;
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
{
System.out.print(" * ");
}
System.out.println();
}
}
}