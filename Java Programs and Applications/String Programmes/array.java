import java.io.*;
class array
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the size of the array");
int l=Integer.parseInt(br.readLine());
String ar[]=new String[l];
//creation
int i;
for(i=0;i<l;i++)
{
System.out.println("Enter the name of the students");
ar[i]=br.readLine();
}
//display
for(i=0;i<l;i++)
{
System.out.println("The name of the students are:"+ar[i]);
}
}
}