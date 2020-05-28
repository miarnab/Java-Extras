import java.io.*;
class binaryfilemain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
binaryfile f1=new binaryfile();
while(true)
{
System.out.println("1.create,2.modify,3.display");
System.out.println("Enter user's choice");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:f1.create();
       break;
case 2:f1.modify();
       break;
case 3:f1.display();
       break;
default:System.out.println("Thank You");
        System.exit(0);
    }
}
}
}

