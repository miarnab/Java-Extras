import java.io.*;
class stringsorting
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a string");
String s=br.readLine();
int l=s.length();
String s1="";
int i,j;
String t="";
for(i=0;i<l;i++)
{
char c=s.charAt(i);
if(c==32)
{
c++;
}
s1=s1+c;
continue;
}
s1="";
String ar[]=new String[l]; 
for(i=0;i<l;i++)
{
for(j=i+1;j<=l;j++)
{
if(ar[i].compareTo(ar[j])<0)
{
ar[i]=t;
ar[i]=ar[j];
ar[j]=t;
}
System.out.println(ar[i]);
}
}
}
}




