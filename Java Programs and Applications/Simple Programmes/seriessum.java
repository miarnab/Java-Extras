import java.io.*;
class seriessum
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
int i;double f=1.0,s=0.0;
for(i=1;i<=n;i++)
{
f=f*i;
s=s+(1/f);
System.out.println("The series is"+"\t"+"1"+"/"+i+"!");
}
System.out.println("The sum of the series is"+s);
}
}