import java.io.*;
class triangle01
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the number of terms");
int n=Integer.parseInt(br.readLine());
int i,j,k;
for(i=1;i<=n;++i)
{
for(j=1;j<=(n-i)+1;++j)
{
System.out.print(" ");
}
for(k=n;k>=i;--k)
{
System.out.print(k);
}
System.out.println();
}
}
}