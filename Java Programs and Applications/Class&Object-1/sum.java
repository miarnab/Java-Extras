import java.io.*;
class sum
{   int a;
    int b;
    int s;
    sum()
    {
        a=0;
        b=0;
        s=0;
    }
    void input(int x,int y)
    {
        a=x;
        b=y;
    }
    void cal()
    {
        s=a+b;
    }
    void disp()
    {
        System.out.println("Sum="+s);
    }
}