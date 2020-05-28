import java.io.*;
class compound extends account
{
double i,r,t;
compound(long a,double p1,double r1,double t1)
{
super(a,p1);
r=r1;
t=t1;
}
double interest()
{
i=p*(Math.pow(1+(r/100),t))-p;
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
