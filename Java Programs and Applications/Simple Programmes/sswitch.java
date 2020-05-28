import java.io.*;
class sswitch
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the two numbers");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int s=0,d=0,m=1,q=1,r=0;
System.out.println("1.Addition,2.Substraction,3.Multiplication,4.Division");
System.out.println("Enter the user's choice");
int ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:s=a+b;
       System.out.println("Sum is"+s);
       break;
case 2:if(a>b)
       {
        d=a-b;
        System.out.println("Difference is"+d);
    }
    else
    {
        d=b-a;
        System.out.println("Difference is"+d);
    }
    break;
case 3:m=a*b;
       System.out.println("Product is"+m);
       break;
case 4:if(a>b)
       {
        q=a/b;
        r=a%b;
        System.out.println("quotient is"+q+"\t"+"remainder is"+r);
    }
    else
    {
        q=b/a;
        r=b%a;
        System.out.println("quotient is"+q+"\t"+"remainder is"+r);
    }
    break;
default:System.out.println("Not a valid choice");
}
}
}    