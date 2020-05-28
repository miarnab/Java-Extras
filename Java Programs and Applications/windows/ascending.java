import java.io.*;import java.util.*;
class ascending
{int a[];
int size;
int i;
int j;
ascending(int n)
{
size=n;
a=new int[size];
}
void entry()
{
Scanner sc=new Scanner(System.in);
a=new int[size];
for(i=0;i<size;i++)
{
System.out.println("Enter numbers in sorted order");
a[i]=sc.nextInt();
}
}
void displaylist()
{
for( i=0;i<size;i++)
{
System.out.println(a[i]+"\t");
}
}
ascending merge(ascending mat)
{
int c1,c2,c3,m1,m2,m3;
m1=mat.size;
m2=mat.size;
c1=0;
c2=0;
c3=0;
ascending ob=new ascending(m1+m2);
while(c1<m1&&c2<m2)
{
if(this.a[c1]<mat.a[c2])
{
ob.a[c3]=this.a[c1];
c1++;
c3++;
}
else if(this.a[c1]>mat.a[c2])
{
ob.a[c3]=mat.a[c2];
c2++;
c3++;
}
else
{
ob.a[c3]=this.a[c1];
c1++;
c2++;
c3++;
}
}
if(c1==m1)
{
ob.a[c3]=mat.a[j];
c3++;
}
else if(c2==m2)
{
for(j=c1;j<m1;j++)
{
ob.a[c3]=this.a[j];
c3++;
}
}
ob.size=c3;
return ob;
}
}





