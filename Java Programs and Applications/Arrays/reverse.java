import java.io.*;
class reverse
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the size of the array");
int n=Integer.parseInt(br.readLine());
int ar[]=new int[n];
//creation
int i;
for(i=0;i<n;i++)
{
System.out.println("Enter the values");
ar[i]=Integer.parseInt(br.readLine());
}
//reverse

