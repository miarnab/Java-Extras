import java.io.*;
class hcf
{int a;
 int b;
 int hcf;
 hcf()
 {
  a=0;
  b=0;
  hcf=0;
}
void input(int c,int d )
{
a=c;
b=d;
}
int findhcf(int x,int y)
{
int i=1,h=0;
for(i=1;i<=x&&i<=y;i++)
{
if((x%i==0)&&(y%i==0))
{
hcf=i;
return hcf;
}
else 
{
return 1;
}
}
}
void display()
{
int h;
hcf=hcf(a);
hcf=hcf(b);
System.out.println(hcf);
}
}




