import java.io.*;
class volumemain
{public static void main(String args[])throws IOException
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    volume ob=new volume();
    System.out.println("Enter the side of the cube:");
    double s=Double.parseDouble(br.readLine());
    System.out.println("Enter the radius and height of the cylinder:");
    double r=Double.parseDouble(br.readLine());
    double h=Double.parseDouble(br.readLine());
    System.out.println("Enter the length,breadth and height of the rectangular box:");
    double l=Double.parseDouble(br.readLine());
    double b=Double.parseDouble(br.readLine());
    double h2=Double.parseDouble(br.readLine());
    double res1=ob.vol(s);
    double res2=ob.vol(r,h);
    double res3=ob.vol(l,b,h2);
    System.out.println("The volume of the cube:"+res1);
    System.out.println("The volume of the cylinder:"+res2);
    System.out.println("The volume of the rectangular box:"+res3);
}
}