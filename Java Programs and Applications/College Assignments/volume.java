import java.io.*;
class volume
{
    void volume(double a)
    {
        double v;
        v=a*a*a;
        System.out.println("The volume of the cube is:"+v);
    }
    void volume(double r,double h)
    {
        double v1;
        v1=3.1416*(r*r)*h;
        System.out.println("Volume of the cylinder is:"+v1);
    }
    void volume(double l,double b,double h1)
    {
        double v2;
        v2=l*b*h1;
        System.out.println("Volume of the rectangular box is:"+v2);
    }
}