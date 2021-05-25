import java.io.*;
class batsman
{int n;
    int truns;
    int inn;
    int sum;
    int inc;
    batsman()
    {
        n=0;
        truns=0;
        inn=0;
        sum=0;
        inc=0;
    }
    void accept(int x,int y,int z)
    {
        n=x;
        truns=y;
        inn=z;
    }
    void calculate()
    {
        sum=n+truns;
        inc=++inn;
        System.out.println("The total sum of runs:"+sum);
        System.out.println("The incremented innings:"+inc);
    }
}