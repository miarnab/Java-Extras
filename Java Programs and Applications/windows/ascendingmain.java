import java.io.*;import java.util.*;
class ascendingmain
{public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter size of thre first matrix");
int s1=sc.nextInt();
System.out.println("Enter size of the second matrix");
int s2=sc.nextInt();
ascending a1=new ascending(s1);
ascending a2=new ascending(s2);
ascending a3=new ascending(s1+s2);
System.out.println("Enter first array");
a1.entry();
System.out.println("Enter second array");
a2.entry();
a3=a1.merge(a2);
System.out.println("Current array object\n");
a1.displaylist();
System.out.println("Second array object\n");
a2.displaylist();
System.out.println("Merged array object\n");
a3.displaylist();
}
}
 
