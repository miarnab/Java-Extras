import java.io.*;
class hcfmain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter two numbers");
int a1=Integer.parseInt(br.readLine());
int b1=Integer.parseInt(br.readLine());
hcf ob=new hcf();
ob.input(a1,b1);
ob.display();
}
}
 