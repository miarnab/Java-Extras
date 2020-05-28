import java.io.*;
class differentiation
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the coefficient of the term");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter the power of the term");
int b=Integer.parseInt(br.readLine());
int ch,p,s;
char c='x';
System.out.println("Enter the number of times you want to differentiate");
System.out.println("1.One time,2.Two time,3.Three time,4.Four time");
System.out.println("Enter the user's choice");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:p=a*b;
       s=b-1;
       if(p==0)
       System.out.println("The first order derivative is"+"\t"+p);
       else if(s==0)
       System.out.println("The first order derivative is"+"\t"+p);
       else
       System.out.println("The first order differentiated term is"+"\t"+p+'x'+'^'+s);
       break;
case 2:p=a*b*(b-1);
       s=b-2;
       if(p==0)
       System.out.println("The first order derivative is"+"\t"+p);
       else if(s==0)
       System.out.println("The first order derivative is"+"\t"+p);
       else
       System.out.println("The first order differentiated term is"+"\t"+p+'x'+'^'+s);
       break;
case 3:p=a*b*(b-1)*(b-2);
       s=b-3;
       if(p==0)
       System.out.println("The first order derivative is"+"\t"+p);
       else if(s==0)
       System.out.println("The first order derivative is"+"\t"+p);
       else
       System.out.println("The first order differentiated term is"+"\t"+p+'x'+'^'+s);
       break;
case 4:p=a*b*(b-1)*(b-2)*(b-3);
       s=b-4;
       if(p==0)
       System.out.println("The first order derivative is"+"\t"+p);
       else if(s==0)
       System.out.println("The first order derivative is"+"\t"+p);
       else
       System.out.println("The first order differentiated term is"+"\t"+p+'x'+'^'+s);
       break;
default:System.out.println("Not a valid choice");
}
}
}       