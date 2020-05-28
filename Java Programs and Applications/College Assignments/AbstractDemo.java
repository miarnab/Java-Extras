import java.io.*;
public class AbstractDemo extends sum
{
    int sumofTwo(int num1,int num2)
    {
        return (num1+num2);
    }
    int sumofThree(int num1,int num2,int num3)
    {
        return (num1+num2+num3);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the three numbers:");
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        AbstractDemo ob1=new AbstractDemo();
        AbstractDemo ob2=new AbstractDemo();
        int res1=ob1.sumofTwo(a,b);
        System.out.println("The sum of the two numbers is:"+res1);
        int res2=ob2.sumofThree(a,b,c);
        System.out.println("The sum of the three numbers is:"+res2);
    }
}