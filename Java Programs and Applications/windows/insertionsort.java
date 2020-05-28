import java.io.*;
class insertionsort
{
int ar[]=new int[1000];
int l;
insertionsort()
{
int l=0;
}
void input()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int i;
System.out.println("Enter size");
l=Integer.parseInt(br.readLine());
for(i=0;i<l;i++)
{
System.out.println("Enter elements");
ar[i]=Integer.parseInt(br.readLine());
}
}
void sort()
{
int i,t,p;
for(i=0;i<l;i++)
{
t=ar[i];
p=i-1;
while(p>=0&&t<ar[p])
{
ar[p+1]=ar[p];
p--;
}
ar[p+1]=t;
}
}
void display()
{
int i;
for(i=0;i<l;i++)
{
System.out.print(ar[i]+"|");
}
System.out.println();
}
}


