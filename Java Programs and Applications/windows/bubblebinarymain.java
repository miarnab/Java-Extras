import java.io.*;
class bubblebinarymain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter length of array");
int n1=Integer.parseInt(br.readLine());
bubblebinary ob=new bubblebinary(n1);
ob.input();
ob.sort();
System.out.println("Enter number to search");
int ns1=Integer.parseInt(br.readLine());
ob.bsearch(ns1);
}
}