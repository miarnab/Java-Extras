import java.io.*;
class midsortmain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter array size");
int x=Integer.parseInt(br.readLine());
midsort ob=new midsort();
ob.input(x);
ob.sort();
ob.display();
}
}
