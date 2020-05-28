import java.io.*;
class diamond
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the value");
int n=Integer.parseInt(br.readLine());
int i,j,k,p=n/2,q=1;
for(i=1;i<=(n/2)+1;i++)
{
for(j=1;j<=p;j++)
System.out.print(" ");
p--;
for(k=1;k<=i;k++)
System.out.print("* ");
System.out.println();
}
for(i=n/2;i>=1;i--)
{
for(j=1;j<=q;j++)
System.out.print(" ");
q++;
for(k=1;k<=i;k++)
System.out.print("* ");
System.out.println();
}
}
}


