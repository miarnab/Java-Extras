import java.io.*;
class simple extends account
{
double i,r,t;
simple(long a,double p1,double r1,double t1)
{
super(a,p1);
r=r1;
t=t1;
}
double interest()
{
i=(p*r*t)/100;
return (i);
}
void display()
{
super.display();
System.out.println("Rate %="+r);
System.out.println("Time(in years)="+t);
System.out.println("Interest in Rs.="+interest());
}
}

 