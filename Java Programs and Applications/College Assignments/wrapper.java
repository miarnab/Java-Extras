import java.io.*;
import java.util.Scanner;
class wrapper
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        double r,p,t;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the principle amount:");
        p=s.nextDouble();
        System.out.println("Enter the rate of interest:");
        r=s.nextDouble();
        System.out.println("Enter the time interval:");
        t=s.nextDouble();
        Double pri=Double.valueOf(p);
        Double rate=Double.valueOf(r);
        Double time=Double.valueOf(t);
        Double si=Double.valueOf((pri*rate*time)/100);
        Double amount=Double.valueOf(si+pri);
        System.out.println("The final value of amount is:"+amount);
    }
}