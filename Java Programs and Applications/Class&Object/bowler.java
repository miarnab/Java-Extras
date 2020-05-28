import java.io.*;
class bowler
{int n;
    int m;
    int runs;
    int wi;
    int inn;
    int sum1;
    int sum2;
    int inc;
    bowler()
    {
        n=0;
        m=0;
        runs=0;
        wi=0;
        inn=0;
        sum1=0;
        sum2=0;
        inc=0;
    }
    void accept(int p,int q,int r,int s,int t)
    {
        n=p;
        m=q;
        runs=r;
        wi=s;
        inn=t;
    }
    void calculate()
    {
        sum1=n+runs;
        sum2=m+wi;
        inc=++inn;
        System.out.println("The sum of the number and runs:"+sum1);
        System.out.println("The sum of the number and wickets:"+sum2);
        System.out.println("The incremented innings is:"+inc);
    }
}