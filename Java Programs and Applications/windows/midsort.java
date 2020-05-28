import java.io.*;
class midsort 
{int right,left,mid,n,count;
 int ar[];
 midsort()
 {
  right=0;
  left=0;
  mid=0;
  n=0;
  count=0;
}
void input(int x)throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
n=x;
int ar[]=new int[n];
//creation
for(int i=0;i<n;i++)
{
System.out.println("Enter value");
ar[i]=Integer.parseInt(br.readLine());
}
}
void sort()
{
int h,i,hp=0,nh=0,nhp=0,mid,t;
if(n%2==0)
{
mid=(n-1)/2;
}
else
{
mid=n/2;
}
left=mid-1;
right=mid+1;
h=ar[0];
for(i=0;i<n;i++)
{
if(ar[i]>h)
{
h=ar[i];
hp=i;
}
}
t=ar[hp];
ar[hp]=ar[mid];
ar[mid]=t;
count=2;
while(count<=n)
{
nh=0;
for(i=0;i<n;i++)
{
if((ar[i]>nh)&&(ar[i]<h))
{
nh=ar[i];
nhp=i;
}
if(count%2==0)
{
t=ar[right];
ar[left]=ar[nhp];
ar[nhp]=t;
left--;
}
n=nh;
count++;
}
}
}
void display()
{
for(int i=0;i<n;i++)
{
System.out.println(ar[i]+"|");
}
}
}
  