import java.io.*;
class generatemain
{public static void nmain(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
generate ob=new generate();
System.out.println("Enter a number");
int num1=Integer.parseInt(br.readLine());
ob.divisor(num1);
}
}
 
