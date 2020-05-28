import java.io.*;
class ternary
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the three numbers");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
int g1,g2;
g1=(a>b)?a:b;
g2=(g1>c)?g1:c;
System.out.println("The greatest number among the three is"+"\t"+g2);
}
}