import java.io.*;
class searching
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
int flag=1,p=0;
System.out.println("Enter the number to search");
int n=Integer.parseInt(br.readLine());
for(i=0;i<5;i++)
{
if(n==ar[i])
{
flag=1;
p=i;
}
}
if(flag==1)
{
System.out.println("The number is found at position"+p);
}
else
{
System.out.println("Not Found");
}
}
}
