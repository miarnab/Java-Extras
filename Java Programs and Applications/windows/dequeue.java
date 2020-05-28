import java.io.*;
class dequeue
{int f;
 int r;
 int ar[];
 int c;
 int i;
 dequeue()
 {
  f=-1;
  r=-1;
  c=0;
}
dequeue(int s)
{
c=s;
int ar[]=new int[c];
for(i=0;i<c;i++)
{
ar[i]=0;
}
}
void input()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter data for array");
for(i=0;i<c;i++)
{
ar[i]=Integer.parseInt(br.readLine());
}
}
void addrear(int item)
{
if((f==-1)&&(r==-1))
{
f=r=0;
ar[r]=item;
}
else if(r<(c-1))
{
r++;
ar[r]=item;
}
else if((f>0)&&(r==(c-1)))
{
for(i=f;i<r;i++)
{
ar[i-1]=ar[i];
}
f--;
ar[r]=item;
}
else
System.out.println("Overflow");
}
void addfront(int item)
{
if((f==0)&&(r==(c-1)))
{
System.out.println("Overflow");
}
else if(f==-1)
{
f=r=0;
ar[f]=item;
}
else if((f==0)&&(r<(c-1)))
{
for(i=r;i>=f;i--)
{
ar[i+1]=ar[i];
}
r++;
}
else
{
f--;
ar[f]=item;
}
}
int deletefront()
{
if((f>-1)&&(f!=r))
{
int a=ar[f];
ar[f]=0;
f++;
return a;
}
else if((f==r)&&(f!=-1))
{
int a=ar[f];
ar[f]=0;
f=r=-1;
return a;
}
else
{
System.out.println("Underflow");
return -999;
}
}
int deleterear()
{
int a=0;
if(r<0)
{
System.out.println("Underflow");
return -999;
}
else if((f==r))
{
a=ar[r];
ar[r]=0;
f=r=-1;
return a;
}
else
{
a=ar[r];
ar[r]=0;
r--;
return a;
}
}
void display()
{
for(i=f;i<=r;i++)
{
System.out.println(ar[i]);
}
}
}
 
 
 
     
