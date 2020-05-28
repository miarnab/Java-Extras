import java.io.*;
class valuemain
{public static void main(String args[])throws IOException
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("Enter the numbers:");
    double a1=Double.parseDouble(br.readLine());
    double b1=Double.parseDouble(br.readLine());
    value ob=new value();
    ob.accept(a1,b1);
    ob.display();
}
}