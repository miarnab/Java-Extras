import java.io.*;
class transpose
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the rows and columns of the matrix");
int n=Integer.parseInt(br.readLine());
int m=Integer.parseInt(br.readLine());
int a[][]=new int[m][n];
int b[][]=new int[m][n];
//creation
int i,j;
System.out.println("Enter the values in the matrix");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
//transpose
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=a[j][i];
System.out.print(" "+b[i][j]);
}
System.out.println();
}
}
}

