import java.io.*;
class insertionsortmain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
insertionsort ob=new insertionsort();
ob.input();
ob.sort();
ob.display();
}
}