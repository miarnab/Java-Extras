import java.io.*;
class main
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the number a:");
        int a2=Integer.parseInt(br.readLine());
        System.out.println("Enter the runs for batsman:");
        int r2=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of innings for batsman:");
        int in2=Integer.parseInt(br.readLine());
        System.out.println("Enter the number b:");
        int b2=Integer.parseInt(br.readLine());
        System.out.println("Enter the number c:");
        int c2=Integer.parseInt(br.readLine());
        System.out.println("Enter the runs given by bowler:");
        int runs2=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of wickets taken:");
        int wickets2=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of innings for bowler;");
        int inn2=Integer.parseInt(br.readLine());
        batsman ob1=new batsman();
        bowler ob2=new bowler();
        ob1.accept(a2,r2,in2);
        ob1.calculate();
        ob2.accept(b2,c2,runs2,wickets2,inn2);
        ob2.calculate();
    }
}