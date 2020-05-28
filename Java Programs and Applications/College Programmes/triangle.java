import java.io.*;
class triangle
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the value");
int n=Integer.parseInt(br.readLine());
int i,j,k,p=n/2,q=1,l;
for(i=1;i<=(n/2)+1;i++)
{
for(j=1;j<=p;j++)
System.out.print(" ");
p-=2;
for(k=(n+1)/2;k>=i;k--)
System.out.print(k);
for(l=2;l<=i;l++)
System.out.print(l);
System.out.println();
}
}
}



