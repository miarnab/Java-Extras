import java.io.*;
class generate
{ void divisors(int num)
{
int i=0;
System.out.println("Divisors of given number"+num+"are:");
for(i=0;i<=num/2;i++)
{
if(num%i==0)
System.out.println(i);
}
}
}
