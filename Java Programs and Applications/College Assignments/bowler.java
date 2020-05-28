import java.io.*;
class bowler
{   int b;
    int c;
    int runs;
    int wickets;
    int truns;
    int twickets;
    int inn;
    bowler()
    {
        b=0;
        c=0;
        runs=0;
        wickets=0;
        inn=0;
    }
    void accept(int b1,int c1,int runs1,int wickets1,int inn1)
    {
        b=b1;
        c=c1;
        runs=runs1;
        wickets=wickets1;
        inn=inn1;
    }
    void calculate()
    {
        truns=runs+b;
        twickets=wickets+c;
        ++inn;
        System.out.println("The total runs is="+truns);
        System.out.println("The total number of wickets is="+twickets);
        System.out.println("The incremented innings is="+inn);
    }
}
        