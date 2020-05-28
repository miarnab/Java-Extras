import java.io.*;
class insertion
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the size of the array");
int s=Integer.parseInt(br.readLine());
int ar[]=new int[s];
//creation
int i;
System.out.println("Enter the values inside the array");
for(i=0;i<s;i++)
{
ar[i]=Integer.parseInt(br.readLine());
}
//insertion
System.out.println("Enter the number to insert");
int n=Integer.parseInt(br.readLine());
System.out.println("Enter the position to insert the number");
int p=Integer.parseInt(br.readLine());
for(i=(s-1);i>=(p-1);i--)
{
ar[i]=ar[i-1];
}
ar[p-1]=n;
//display
for(i=0;i<=s;i++)
{
System.out.println(ar[i]);
}
}
}