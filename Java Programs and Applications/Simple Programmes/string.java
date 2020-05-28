import java.io.*;
class string
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the string");
String s=br.readLine();
String s1="";
int l=s.length();
int i;
for(i=0;i<=l;i++)
{
}
s1=s.toUpperCase();
System.out.println("The modified string is"+s1);
}
}

