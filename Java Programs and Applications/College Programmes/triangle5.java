import java.io.*;
class triangle5
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the value");
int n=Integer.parseInt(br.readLine());
int i,j,k,p=(n/2),q=1;
for(i=1;i<=n;i++)
{
System.out.print("* ");
}
System.out.println();
//second quadrant
for(i=1;i<=n/2;i++)
{
for(j=1;j<=p;j++)
System.out.print("* ");
p--;
for(k=1;k<=i;k++)
System.out.print(" ");
System.out.println();
}
//third quadrant
for(i=(n/2);i>=1;i--)
{
for(j=1;j<=q;j++)
System.out.print("* ");
q++;
for(k=1;k<=i;k++)
System.out.print(" ");
System.out.println();
}
for(i=1;i<=n;i++)
{
System.out.print("* ");
}
System.out.println();
}
}




