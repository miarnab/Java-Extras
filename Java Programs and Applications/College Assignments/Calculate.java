import java.io.*;
import java.util.Scanner;
class Calculate implements Area
{
    int l,b,r;
    double a1,a2;
    public void rect()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        l=s.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        b=s.nextInt();
        a1=l*b;
        System.out.println("The area of the rectangle is:"+a1);
    }
    public void circle()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        r=s.nextInt();
        a2=3.14*r*r;
        System.out.println("The area of the circle is:"+a2);
    }
}