import java.io.*;
class factnum
{int n;
 int f;
 factnum()
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
int i;
for(i=1;i<=n;i++)
{
f=fact(n);
System.out.println(i+"\t"+f);
f=1;
}
}
}
