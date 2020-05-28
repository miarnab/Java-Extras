import java.io.*;
class productmain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter two numbers");
int a1=Integer.parseInt(br.readLine());
int b1=Integer.parseInt(br.readLine());
product ob=new product();
ob.input(a1,b1);
ob.display();
}
}