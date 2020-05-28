import java.io.*;
class divisible7
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
int i,c=0;
for(i=1;i<=n;i++)
{
if(i%7==0)
{
System.out.println("The numbers divisible by 7 are"+"\t"+i);
}
++i;
}
}
}




