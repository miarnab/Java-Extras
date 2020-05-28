import java.io.*;
class stackmain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a string");
String y=br.readLine();
String r=br.readLine();
r=y;
System.out.println("Enter size of stack");
int size1=Integer.parseInt(br.readLine());
System.out.println("Enter a number");
int n=Integer.parseInt(br.readLine());
stack ob=new stack(size1);
while(n>0)
{
System.out.println("1.push");
System.out.println("2.pop");
System.out.println("3.display");
System.out.println("Enter user's choice");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:System.out.println("Enter item");
       int item1=Integer.parseInt(br.readLine());
       ob.push(item1);
       break;
case 2:ob.pop();
       break;
case 3:ob.display();
       break;
    }
    System.out.println("Press y to repeat");
}
}
}
       
