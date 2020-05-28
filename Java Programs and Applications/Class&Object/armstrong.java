import java.io.*;
class armstrong
{int n;
    armstrong()
    {
        n=0;
    }
    void input()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the number:");
        int n=Integer.parseInt(br.readLine());
    }
    boolean check()
    {
        int r=0,s=0,n1=n;
        while(n1>0)
        {
            r=n1%10;
            s=s+(r*r*r);
            n1=n1/10;
        }
        if(s==n)
        return true;
        else 
        return false;
    }
}