import java.io.*;
class pallindrome
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number");
int n=Integer.parseInt(br.readLine());
int r,rev=0,i=0;
i=n;
while(i>0)
{
r=i%10;
rev=rev*10+r;
i=i/10;
}
if(n==rev)
{
System.out.println("The number entered is a pallindrome");
}
else
{
System.out.println("The number entered is not a pallindrome");
}
}
}