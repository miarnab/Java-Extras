import java.io.*;
class power
{int n;
 power()
 {
  n=0;
  }
void input(int a)
{
n=a;
}
int power(int x,int y)
{
if(y==0)
return 1;
else if(y==1)
return x;
else
return x*power(x,(y-1));
}
void display()
{
System.out.println("Power of the number="+);
}
} 