import java.io.*;
class student
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the size of the arrays");
int n=Integer.parseInt(br.readLine());
String name[]=new String[n];
double rno[]=new double[n];
int marks[]=new int[n];
String grade[]=new String[n];
//creation
int i;
System.out.println("Enter the values inside the array");
for(i=0;i<n;i++)
{
name[i]=br.readLine();
rno[i]=Double.parseDouble(br.readLine());
marks[i]=Integer.parseInt(br.readLine());
grade[i]=br.readLine();
}
//searching
System.out.println("Enter the name to search");
String s=br.readLine();
int p=0,flag=0;
for(i=0;i<n;i++)
{
if(name[i].equalsIgnoreCase(s))
{
flag=1;
p=i;
break;
}
}
if(flag==1)
{
System.out.println("The name of the student is"+name[p]);
System.out.println("The marks of the student is"+marks[p]);
System.out.println("The grade of the student is"+grade[p]);
}
else
System.out.println("The student's name is not found");
}
}

