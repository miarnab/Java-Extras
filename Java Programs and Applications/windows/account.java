import java.io.*;
class account
{
protected long accountnumber;
protected double p;
account(long a,double p1)
{
accountnumber=a;
p=p1;
}
void display()
{
System.out.println("Account Number="+accountnumber);
System.out.println("Principle="+p);
}
}