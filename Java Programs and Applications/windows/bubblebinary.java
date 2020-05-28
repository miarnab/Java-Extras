import java.io.*;
class bubblebinary
{int n;
 int ar[]=new int[n];
 bubblebinary()
 {
  n=0;
}
bubblebinary(int x)
{
n=x;
}
void input()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i;
for(i=0;i<n;i++)
{
System.out.println("Enter a value");
ar[i]=Integer.parseInt(br.readLine());
}
}
void sort()
{
int i,j,t=0;
for(i=0;i<n;i++)
{
for(j=0;j<(n-1)-i;j++)
{
if(ar[j]>ar[j+1])
{
t=ar[j];
ar[j]=ar[j+1];
ar[j+1]=t;
}
}
}
}
void bsearch(int ns)
{
int mid=0,start=0,end=n-1,flag=0,p=0;
while(start<=end)
{
mid=(start+end)/2;
if(ar[mid]==ns)
{
flag=1;
p=mid+1;
break;
}
else if(ns<ar[mid])

end=mid-1;
else
start=mid+1;
}
if(flag==1)
System.out.println("Found at position"+p);
else
System.out.println("Not Found");
}
}
  