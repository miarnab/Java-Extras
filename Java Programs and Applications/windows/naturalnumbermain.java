import java.io.*;
class naturalnumbermain
{public static void main(String args[])throws IOException
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.println("Enter a number");
  int i1=Integer.parseInt(br.readLine());
  naturalnumber ob=new naturalnumber();
  ob.input(i1);
  ob.display();
}
}
