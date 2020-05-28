import java.io.*;
class transpose
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the dimensions of the matrix");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int ar[][]=new int[a][b];
int p[][]=new int[b][a];
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
//transpose
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
p[i][j]=ar[j][i];
}
}
//display
System.out.println("The transpose of the matrix is");
for(i=0;i<b;i++)
{
for(j=0;j<a;j++)
{
System.out.print("\t"+p[i][j]);
}
System.out.println();
}
}
}
