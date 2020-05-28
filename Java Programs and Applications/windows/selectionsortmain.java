import java.io.*;
class selectionsortmain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter a number");
int n1=Integer.parseInt(br.readLine());
System.out.println("Enter value");
int i1=Integer.parseInt(br.readLine());
selectionsort ob=new selectionsort();
ob.read_list();
ob.index_of_min(i1);
ob.selesorting();
ob.display_list();
}
}