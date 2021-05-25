import java.io.*;
class volume
{   double v1;
    double v2;
    double v3;
    volume()
    {
        v1=0.00;
        v2=0.00;
        v3=0.00;
    }
    double vol(double x)
    {
        v1=x*x*x;
        return v1;
    }
    double vol(double y,double z)
    {
        v2=3.14*(y*y)*z;
        return v2;
    }
    double vol(double l1,double b1,double h1)
    {
        v3=l1*b1*h1;
        return v3;
    }
}