import java.io.*;
class derivative
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the coefficient of the term");
int a=Integer.parseInt(br.readLine());
System.out.println("Enter the power of the term");
int b=Integer.parseInt(br.readLine());
System.out.println("Enter the number of terms you want to differentiate");
int n=Integer.parseInt(br.readLine());
int i,p=1,s=0;
for(i=0;i<=n;i++)
{
p=a*(b-i);
s=b-(i+1);
}
if(s==0)
System.out.println("The derivative is"+"\t"+p);
else if(p==0)
System.out.println("The derivative is not possible");
else
System.out.println("The derivative is"+"\t"+p+"x"+"^"+s);

}
}
