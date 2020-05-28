import java.io.*;
class product
{int a;
 int b;
 int p;
 product()
 {
  a=0;
  b=0;
  p=1;
}
void input(int x,int y)
{
a=x;
b=y;
}
int product(int x,int y)
{
if(y==1)
return x;
else 
return x+product(x,(y-1));
}
void display()
{
System.out.println("Product of the numbers="+(a*b));
}
}