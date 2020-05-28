import java.io.*;
class selectionsort
{
int n;
int ar[]=new int[10];
selectionsort()//constructor
{
n=0;
}
void read_list()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter size");
n=Integer.parseInt(br.readLine());
int ar[]=new int[n];
//creation
int i;
for(i=0;i<n;i++)
{
System.out.println("Enter Number");
ar[i]=Integer.parseInt(br.readLine());
}
}
int index_of_min()
{
int i,s,p,j;
s=ar[i];
p=i;
for(j=i+1;j<n;j++)
{
if(ar[j]<s)//calculating minimum
{
s=ar[j];
p=j;
}
}
return p;
}
void selesorting(int i)
{
int j,t=0,p1=0;
for(j=0;j<n-1;j++)
{
p1=index_of_min(j);
t=ar[i];
ar[i]=ar[p1];
ar[p1]=t;
}
}
void display_list()
{
int i;
System.out.println("The Sorted Array is");
for(i=0;i<n;i++)
{
System.out.print(ar[i]+"\t");
}
}
}
 
