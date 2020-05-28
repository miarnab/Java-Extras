import java.io.*;
class integration
{public static void main(String args[])throws IOException 
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the coefficient of the term");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter the power of the term");
int b=Integer.parseInt(br.readLine());
int ch,s=0,p=1;
System.out.println("Enter the user's choice");
System.out.println("Enter the number of terms you want to inegrate");
System.out.println("1.One time,2.Two time,3.Three time,4.Four time");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:s=b+1;
       p=b+1;
       if((s==0)&&(p==0))
       System.out.println("The first order integral of the term does not exist");
       else if(a==0)
       System.out.println("The first order integral of the term is"+"\t"+a);
       else 
       System.out.println("The first order integral of the term is"+"\t"+"("+a+"x"+"^"+s+")"+"/"+p);
       break;
case 2:s=b+2;
       p=((b+1)*(b+2));
       if((s==0)&&(p==0))
       System.out.println("The first order integral of the term does not exist");
       else if(a==0)
       System.out.println("The first order integral of the term is"+"\t"+a);
       else 
       System.out.println("The first order integral of the term is"+"\t"+"("+a+"x"+"^"+s+")"+"/"+p);
       break;
case 3:s=b+3;
       p=((b+1)*(b+2)*(b+3));
       if((s==0)&&(p==0))
       System.out.println("The first order integral of the term does not exist");
       else if(a==0)
       System.out.println("The first order integral of the term is"+"\t"+p);
       else 
       System.out.println("The first order integral of the term is"+"\t"+"("+a+"x"+"^"+s+")"+"/"+p);
       break;
case 4:s=b+4;
       p=((b+1)*(b+2)*(b+3)*(b+4));
       if((s==0)&&(p==0))
       System.out.println("The first order integral of the term does not exist");
       else if(a==0)
       System.out.println("The first order integral of the term is"+"\t"+a);
       else 
       System.out.println("The first order integral of the term is"+"\t"+"("+a+"x"+"^"+s+")"+"/"+p);
       break;
default:System.out.println("Not a valid choice");
}
}
}       