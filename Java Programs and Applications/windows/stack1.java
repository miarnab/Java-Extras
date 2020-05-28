import java.io.*;
class stack1
{int st[]=new int[5];
 int cap;
 int top;
 int i;
 stack1()
 {
  cap=0;
  top=-1;
}
stack1(int val)
{
cap=val;
}
void push(int item)
{
if(top==(cap-1))
System.out.println("Stack Overflow");
else
{
top++;
st[top]=item;
}
}
int pop()
{
if(top==-1)
return -999;
else
st[top]=0;
top--;
return st[top];
}
void display()
{
for(i=top;i>=0;i--)
{
System.out.println(st[i]);
}
}
}

  
     