import java.io.*;
class lowercase
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the string");
String s=br.readLine();
String s1=" ";
int l=s.length();
int i;
char c1=' ';
for(i=0;i<l;i++)
{
char c=s.charAt(i);
if(c==32)
{
System.out.print(" ");
c++;
}
else if((c>=65)&&(c<=90))
{
c1=(char)(c+32);
System.out.print(c1);
}
else
System.out.print(c);
}
}
}

