import java.io.*;
class fibonacci
{int n;
 fibonacci()
 {
  n=0;
}
void input(int a)
{
n=a;
}
int fibo(int x)
{
if(x==1)
return 1;
else if(x==2)
return 1;
else
return (fibo(x-2)+fibo(x-1));
}
void display()
{
int i;
for(i=1;i<=n;i++)
{
int r=fibo(i);
System.out.println(r+"\t");
}
}
} 
