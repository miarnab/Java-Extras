import java.io.*;
class basic
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enetr the value of n:");
        int n=Integer.parseInt(br.readLine());
        int m;
        m=n%6;
        System.out.println(m);
    }
}