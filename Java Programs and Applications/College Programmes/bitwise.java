import java.io.*;
class bitwise
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the two numbers");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
a=a^b;
b=b^a;
a=a^b;
System.out.println("The two swaped numbers are"+a+"\t"+b);
}
}

