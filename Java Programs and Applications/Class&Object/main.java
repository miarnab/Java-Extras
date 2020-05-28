import java.io.*;
class main
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        batsman ob1=new batsman();
        System.out.println("Enter the number:");
        int n1=Integer.parseInt(br.readLine());
        System.out.println("Enter the total runs:");
        int truns1=Integer.parseInt(br.readLine());
        System.out.println("Enter the innings:");
        int inn1=Integer.parseInt(br.readLine());
        ob1.accept(n1,truns1,inn1);
        ob1.calculate();
        bowler ob2=new bowler();
        System.out.println("Enter the two numbers:");
        int n2=Integer.parseInt(br.readLine());
        int m1=Integer.parseInt(br.readLine());
        System.out.println("Enter the runs given:");
        int runs1=Integer.parseInt(br.readLine());
        System.out.println("Enter the wickets taken:");
        int wi1=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of innings:");
        int inn2=Integer.parseInt(br.readLine());
        ob2.accept(n2,m1,runs1,wi1,inn2);
        ob2.calculate();
    }
}