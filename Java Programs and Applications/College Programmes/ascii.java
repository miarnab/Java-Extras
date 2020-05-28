import java.io.*;
class ascii
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int as;
as=(int)('\n');
System.out.println("The ASCII value of the character is"+"\t"+as);
}
}
