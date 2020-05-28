import java.io.*;
class factorial
{int n;
 int f;
 factorial()
 {
  n=0;
  f=1;
}
void input(int x)
{
n=x;
}
int fact(int y)
{
if(y==1)
return 1;
else
return y*fact(y-1);
}
void display()
{
f=fact(n);
System.out.println("Factorial of the number"+n+"is"+f);
}
}
  