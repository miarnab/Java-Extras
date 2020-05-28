import java.io.*;
class cubic
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the coefficients of cubic equation");
double a=Double.parseDouble(br.readLine());
double b=Double.parseDouble(br.readLine());
double c=Double.parseDouble(br.readLine());
double d=Double.parseDouble(br.readLine());
System.out.println("Enter the upper and lower limits");
double p=Double.parseDouble(br.readLine());
double q=Double.parseDouble(br.readLine());
double i,s=0.00;
for(i=p;i<=q;i++)
{
s=(a*(i*i*i))+(b*(i*i))+(c*i)+d;
if(s==0)
{
System.out.println("The factor of the equation is"+i);
}
else
System.out.println("These are not a factor");
}
}
}
