import java.io.*;
class accountmain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int ch;long a1;
double p2,r2,t2;
System.out.println("Enter account number");
a1=Long.parseLong(br.readLine());
System.out.println("Enter principal number");
p2=Double.parseDouble(br.readLine());
System.out.println("Enter rate %");
r2=Double.parseDouble(br.readLine());
System.out.println("Enter time in years");
t2=Double.parseDouble(br.readLine());
System.out.println("1.Simple Interest");
System.out.println("2.Compound Interest");
System.out.println("Enter user's choice");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:simple ob=new simple(a1,p2,r2,t2);
       System.out.println("Simple interest calculation");
       ob.display();
       break;
case 2:compound ob1=new compound(a1,p2,r2,t2);
       System.out.println("Compound interest calculation");
       ob1.display();
       break;
    }
}
}