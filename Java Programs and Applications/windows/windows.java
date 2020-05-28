import java.io.*;
class windows
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a number");
int n1=Integer.parseInt(br.readLine());
power ob=new power();
ob.input(n1);
ob.display();
}
}