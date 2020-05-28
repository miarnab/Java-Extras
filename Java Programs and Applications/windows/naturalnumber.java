import java.io.*;
class naturalnumber
{int i;
 naturalnumber()
 {
  i=1;
}
void input(int a)
{
 i=a;
}
int number(int x)
{
if(x>0)
return x;
else
return 0;
}
void display()
{
for(i=1;i<=10;i++)
{
System.out.println(i);
}
}
}
