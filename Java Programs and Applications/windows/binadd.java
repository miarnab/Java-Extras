import java.io.*;
class binadd
{int b;
 int s;
 binadd()
 {
  b=0;
  s=0;
}
void accept()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter binary number");
b=Integer.parseInt(br.readLine());
}
binadd addition(binadd t1,binadd t2)
{
int h,l,n=b,c=0,p=0,d1,d2,s1=0;
if(t1.b>t2.b)
{
h=t1.b;
l=t2.b;
}
else
{
h=t2.b;
l=t1.b;
}
while(l>0)
{
d1=l%10;
d2=h%10;
s1=d1+d2+c;
if(s1<=1)
{
c=0;
}
else if(s1==2)
{
s1=0;
c=1;
}
else if(s1==3)
{
s1=1;
c=1;
}
s=s+(int)(Math.pow(10,p))*s1;
p++;
l=l/10;
h=h/10;
}
while(h>0)
{
d1=h%10;
s1=d1+c;
if(s1<=1)
{
c=0;
}
else
{
s1=0;
c=1;
}
s=s+(int)(Math.pow(10,p))*s1;
h=h/10;
}
s=s+(int)(Math.pow(10,p))*c;
binadd t3=new binadd();
t3.b=s;
return(t3);
}
void show()
{
System.out.println(b);
}
}



