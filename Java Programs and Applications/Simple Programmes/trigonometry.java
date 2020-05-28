import java.io.*;
class trigonometry
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the angle in degree");
double x=Double.parseDouble(br.readLine());
double y,a,b,c,d,e,f;
y=(22*x)/(7*180);
a=Math.sin(y);
b=Math.cos(y);
c=Math.tan(y);
d=1/a;
e=1/b;
f=1/c;
System.out.println("sin x="+a);
System.out.println("cos x="+b);
System.out.println("tan x="+c);
System.out.println("cosec x="+d);
System.out.println("sec x="+e);
System.out.println("cot x="+f);
}
}