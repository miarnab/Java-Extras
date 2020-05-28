import java.io.*;
class stack1main
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter capacity of array");
int cap1=Integer.parseInt(br.readLine());
stack1 ob=new stack1(cap1);
String r="Y";
while(r.equalsIgnoreCase("y"))
System.out.println("Enter choice");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:System.out.println("Enter element to insert");
       int item1=Integer.parseInt(br.readLine());
       ob.push(item1);
       break;
case 2:int q1=ob.pop();
       if(q1==-999)
       System.out.println("Stack Empty");
       else 
       System.out.println("Element to be inserted="+q1);
       break;
case 3:ob.display();
       break;
    }
    System.out.println("Press Y to continue main menu");
    r=br.readLine();
}
}
