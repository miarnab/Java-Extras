import java.io.*;
class dates
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int ar[]={31,28,31,30,31,30,31,31,30,31,30,31};
//creation
int i;
for(i=0;i<12;i++)
{
System.out.println("Enter a value");
ar[i]=Integer.parseInt(br.readLine());
}
//dates
int d3=0,d4=0,d5=0,s=0;
for(i=0;i<12;i++)
{
System.out.println("Enter the first date");
int d1=Integer.parseInt(br.readLine());
System.out.println("Enter the second date");
int d2=Integer.parseInt(br.readLine());
System.out.println("Enter the first month");
int m1=Integer.parseInt(br.readLine());
System.out.println("Enter the second month");
int m2=Integer.parseInt(br.readLine());
System.out.println("Enter the first year");
int y1=Integer.parseInt(br.readLine());
System.out.println("Enter the second year");
int y2=Integer.parseInt(br.readLine());
if(y1>y2)
{
d3=y1-y2;
}
else
{
d3=y2-y1;
}
if(m1>m2)
{
d4=m1-m2;
}
else
{
d4=m2-m1;
}
if(d1>d2)
{
d5=d1-d2;
}
else
{
d5=d2-d1;
}
if(y1%4==0)
{
ar[1]=29;
s=(d3*366)+d4+d5;
}
else
{
ar[1]=28;
s=(d3*365)+d4+d5;
}
System.out.println("Total number of days="+s);
}
}
}








