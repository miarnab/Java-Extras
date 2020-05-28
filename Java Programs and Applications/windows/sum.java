import java.io.*;
class sum
{int n;
 int s;
 sum()
 {
  n=0;
  s=0;
}
void input(int a)
{
n=a;
}
int sum(int x)
{
int r=0;
if(x>0)
{
r=x%10;
s=s+r;
return sum(x/10);
}
else 
return s;
}
void display()
{
s=sum(n);
System.out.println("Sum of digits="+s);
}
}