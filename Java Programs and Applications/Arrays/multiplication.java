import java.io.*;
class multiplication
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of rows and columns of the matrix");
int m=Integer.parseInt(br.readLine());
int n=Integer.parseInt(br.readLine());
int a[][]=new int[m][n];
