import java.io.*;
class batsman
{   int a;
    int r;
    int in;
    int sum;
    batsman()
    {
        a=0;
        r=0;
        in=0;
        sum=0;
    }
    void accept(int a1,int r1,int in1)
    {
        a=a1;
        r=r1;
        in=in1;
    }
    void calculate()
    {
        sum=a+r;
        ++in;
        System.out.println("The total run is="+sum);
        System.out.println("The incremented innings is="+in);
    }
}
    