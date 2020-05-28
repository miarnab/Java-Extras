import java.io.*;
 class SmithNo
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int num,savNum;
System.out.print("Enter a number");
num=Integer.parseInt(br.readLine());
int i,digit=0,sumdigit=0,sum=0,sumprime=0,factor,countoffactors=0,prodfactors=1;
//checking whether it's a prime number or not
for(i=1;i<=num;i++)
if(num%i==0)
countoffactors++;
if(countoffactors>2)
{
//calculate its sum of digits
savNum=num;
System.out.print("Sum of digits(");
while(savNum>0)
{
digit=savNum%10;
sumdigit+=digit;
savNum/=10;
System.out.print(digit+",");
}
System.out.println(")is:"+sumdigit);
//calculate sum of prime factors
factor=2;
int Num2=num;
System.out.print("Sum of prime factors(");
while(factor<=Num2)
{
if(Num2%factor==0)
{
//*if valid prime factor
System.out.print(factor+",");
if(factor<10)
{
//ie it it is single digit factor
sumprime+=factor;
}
else
{
savNum=factor;
while(savNum>0)
{
digit=(int)savNum%10;
sumprime+=digit;
//individual digits of factor are added to sum of prime numbers
savNum/=10;
}
}
Num2/=factor;
}
else
{
//else:invalid prime factor
if(factor==2)
factor=3;
else
factor+=2;
}
}
System.out.println("-)is:"+sumprime);
if(sumprime==sumdigit)
System.out.println("IS SMITH NUMBER");
else
System.out.println("NOT A SMITH NUMBER");
}
}
}
 
  