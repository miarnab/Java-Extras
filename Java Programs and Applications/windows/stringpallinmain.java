import java.io.*;
class stringpallinmain
{public static void main(String args[])throws IOException
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.println("Enter a string");
  String s3=br.readLine();
  stringpallin ob=new stringpallin();
  ob.input(s3);
  ob.display();
}
}
