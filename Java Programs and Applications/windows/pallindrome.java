import java.io.*;
class pallindrome
{int n;
 int rev;
 pallindrome()
 {
  n=0;
  rev=0;
 }
void input(int a)
{
n=a;
}
int reverse(int x)
{
int r=0;
if(x>0)
{
r=x%10;
rev=rev*10+r;
return reverse(x/10);
}
else 
return rev;
}
void display()
{
rev=reverse(n);
if(rev==n)
System.out.println("Pallindrome");
else
System.out.println("Not a pallindrome");
}
}