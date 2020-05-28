import java.io.*;
class ar
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int values[]={1,2,3,4,5,6,7,8};
        System.out.println("Enter the value of x:");
        int x=Integer.parseInt(br.readLine());
        int i;
        for(i=0;i<x;i++)
        {
            System.out.println(values[i]);
        }
    }
}