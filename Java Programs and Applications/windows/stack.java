import java.io.*;
class stack
{
int ar[]=new int[10];
int size,i,top;
stack()
{
for(i=0;i<5;i++)
{
ar[i]=0;
}
top=-1;
size=0;
i=0;
}
stack(int s)
{
size=s;
}
void push(int item)
{
if(top==size-1)
{
System.out.println("stack overflow");
}
else
{
top++;
ar[top]=item;
}
}
void pop()
{
if(top==-1)
{
System.out.println("Deletion not possible");
}
else
{
System.out.println("Deleted item is="+ar[top]);
ar[top]=0;
top--;
}
}
void display()
{
for(i=top;i>=0;i--)
{
System.out.println(ar[i]);
}
}
}

