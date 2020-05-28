import java.io.*;
class sum1
{int a;
    int b;
    int s;
    sum1()
    {
        a=0;
        b=0;
    }
    sum1()throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the two numbers:");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
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