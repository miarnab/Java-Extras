import java.io.*;
class abbreviation
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a name");
String s=br.readLine();
String s1=" ";
int l=s.length();
s1=s1+(s.charAt(0));
int i,c=0;
for(i=0;i<l;i++)
{
char ch=s.charAt(i);
if(c==32)
{
c++;
}
c1=s.substring(i);
System.out.println("The short form of the name with the surname is:"+s1);
}
}
