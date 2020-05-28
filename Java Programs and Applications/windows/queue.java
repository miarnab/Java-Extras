import java.io.*;
class queue
{
int ar[]=new int[10];
int size,i,front,rear;
queue()
{
for(i=0;i<5;i++)
{
ar[i]=0;
}
front=-1;
rear=-1;
size=0;
i=0;
}
queue(int s)
{
size=s;
}
void insert(int item)
{
if(rear==-1)
{
System.out.println("queue overflow");
}
else
{
front++;
ar[front]=item;
}
}
void remove()
{
if(front==-1)
{
System.out.println("Deletion not possible");
}
else
{
System.out.println("Deleted item is="+ar[front]);
ar[front]=0;
front--;
}
}
void display()
{
for(i=front;i>=0;i--)
{
System.out.println(ar[i]);
}
}
}

