import java.io.*;
class quadratic
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the value of a,b and c");
double a=Double.parseDouble(br.readLine());
double b=Double.parseDouble(br.readLine());
double c=Double.parseDouble(br.readLine());
double d=0.00,m=0.00,p=0.00,q=0.00;
d=((b*b)-(4.0*a*c));
if(d<0.00)
{
System.out.println("The roots are imaginery");
}
else
{
m=Math.sqrt(d);
p=((-b+m)/(2.0*a));
q=((-b-m)/(2.0*a));
System.out.println("The roots are real");
System.out.println("The first root is"+p);
System.out.println("The second root is"+q);
}
}
}
