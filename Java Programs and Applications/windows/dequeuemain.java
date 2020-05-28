import java.io.*;
class dequeuemain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter size");
int s1=Integer.parseInt(br.readLine());
dequeue ob=new dequeue(s1);
System.out.println("Enter element to add");
int item1=Integer.parseInt(br.readLine());
String a="Y";
while(a.equalsIgnoreCase("Y"))
{
System.out.println("1.Add to rear");
System.out.println("2.Add to front");
System.out.println("3.Delete from rear");
System.out.println("4.Delete from front");
System.out.println("5.Display");
System.out.println("Enter the user's choice");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:ob.addrear(item1);
       break;
case 2:ob.addfront(item1);
       break;
case 3:ob.deletefront();
       break;
case 4:ob.deleterear();
       break;
case 5:ob.display();
       break;
    }
    System.out.println("Press Y to continue");
    a=br.readLine();
}
}
}
       
       