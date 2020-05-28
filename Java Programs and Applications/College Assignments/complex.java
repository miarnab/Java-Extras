import java.io.*;
class complex
{   
    complex(double a,double b,double c,double d)
    {
        double s1,s2;
        s1=a+c;
        s2=b+d;
        System.out.println("The sum of the complex numbers is:"+s1+"+"+s2+"j");
    }
    complex(double a,double b,int c,int d)
    {
        double d1,d2;
        d1=a-c;
        d2=b-d;
        System.out.println("The difference of the complex numbers is:"+d1+"+"+d2+"j");
    }
    complex(int a,int b,int c,int d)
    {
        double m1,m2;
        m1=(a*c)-(b*d);
        m2=(b*c)+(a*d);
        System.out.println("The product of the two complex numbers is:"+m1+"+"+m2+"j");
    }
    complex(int a,int b,int c,double d)
    {
        double d1,d2;
        d1=((a*c)+(b*d))/((c*c)+(d*d));
        d2=((b*c)-(a*d))/((c*c)+(d*d));
        System.out.println("The division of the complex numbers is:"+d1+"+"+d2+"j");
    }
    complex(double a,double b,double c,int d)
    {
        double arg1,arg2;
        arg1=Math.toDegrees(Math.atan(b/a));
        arg2=Math.toDegrees(Math.atan(d/c));
        System.out.println("The argument of the first complex number is:"+arg1);
        System.out.println("The argument of the second complex number is:"+arg2);
    }
}
        
        