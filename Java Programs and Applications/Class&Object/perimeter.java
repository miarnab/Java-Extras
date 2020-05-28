import java.io.*;
class perimeter
{int p1;
 int p2;
    perimeter()
    {
        p1=0;
        p2=0;
    }
    int peri(int x)
    {
        p1=4*x;
        return p1;
    }
    int peri(int l,int b)
    {
        p2=2*(l+b);
        return p2;
    }
}