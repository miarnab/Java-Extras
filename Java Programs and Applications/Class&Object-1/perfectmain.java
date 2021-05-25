import java.io.*;
class perfectmain
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the number");
        int n1=Integer.parseInt(br.readLine());
        perfect ob=new perfect(n1);
        int res=ob.check();
        if(res==1)
        System.out.println("Perfect Number");
        else
        System.out.println("Not a Perfect Number");
    }
}