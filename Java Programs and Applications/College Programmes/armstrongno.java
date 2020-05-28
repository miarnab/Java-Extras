import java.io.*;
class armstrongno
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number");
int n=Integer.parseInt(br.readLine());
int i=0,r,s=0,c=1;
n=i;
while(i>0)
{
r=i%10;
c=(r*r*r);
s=s+c;
i=i/10;
}
if(n==s)
System.out.println("The number entered is aa armstrong number");
else
System.out.println("The number entered is not an armstrong number");
}
}