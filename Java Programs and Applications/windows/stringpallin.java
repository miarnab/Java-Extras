import java.io.*;
class stringpallin
{String s;
 stringpallin()
 {
  s="";
}
String reverse(int l)
{
String s1="";
int i=0;
for(i=0;i<l;i++)
{
char c=s.charAt(i);
if(c==32)
{c++;
return s1;
}
else
{
return s;
}
}
}
void display()
{
int l=s.length();
String s2=reverse(l-1);
if(s2.equals(s))
System.out.println("Pallindrome");
else
System.out.println("Not a pallindrome");
}
}