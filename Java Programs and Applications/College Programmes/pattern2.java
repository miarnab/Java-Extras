import java.io.*;
class pattern2
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
int i,j,f=0,s=1,t;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
t=f+s;
f=s;
s=t;
System.out.print("\t"+f);
}
System.out.println();
}
}
}