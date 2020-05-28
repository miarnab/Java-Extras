import java.io.*;
class swaping3
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the two numbers");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int t;
t=a;
a=b;
b=t;
System.out.println("The sorted numbers are"+"\t"+a+"\t"+b);
}
}
