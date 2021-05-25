import java.io.*;
class summain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
sum ob=new sum();
System.out.println("Enter the two numbers:");
int a1=Integer.parseInt(br.readLine());
int b1=Integer.parseInt(br.readLine());
ob.input(a1,b1);
ob.cal();
ob.disp();
}
}