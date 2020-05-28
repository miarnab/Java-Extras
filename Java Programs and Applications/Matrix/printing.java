import java.io.*;
class printing
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the dimensions of the matrix");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int ar[][]=new int[a][b];
//creation
int i,j;
System.out.println("Enter the numbers inside the matrix");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
ar[i][j]=Integer.parseInt(br.readLine());
}
}
//printing
System.out.println("The given matrix is");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.print("\t"+ar[i][j]);
}
System.out.println();
}
}
}