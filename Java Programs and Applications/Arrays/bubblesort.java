import java.io.*;
class bubblesort
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int ar[]=new int[5];
//creation
int i;
for(i=0;i<5;i++)
{
System.out.println("Enter the numbers");
ar[i]=Integer.parseInt(br.readLine());
}
//searching
int j,t;
for(i=0;i<5;i++)
{
for(j=0;j<5;j++)
{
if(ar[i]<ar[j])
{
t=ar[i];
ar[i]=ar[j];
ar[j]=t;
}
System.out.println("The sorted order is"+ar[i]);
}
}
}
}


