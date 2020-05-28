import java.io.*;
class last5
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the string");
String s=br.readLine();
int l=s.length();
int i;char c1,c2,c3,c4,c5;
for(i=0;i<l;i++)
{
char c=s.charAt(i);
}
c1=s.charAt(l-1);
c2=s.charAt(l-2);
c3=s.charAt(l-3);
c4=s.charAt(l-4);
c5=s.charAt(l-5);
System.out.println("The last five characters of the string is"+" "+c1+" "+c2+" "+c3+" "+c4+" "+c5);
}
}