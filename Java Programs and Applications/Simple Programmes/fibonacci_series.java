import java.io.*;
 class fibonacci_series
{
 public static void main(String args[])throws IOException
 {
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br=new BufferedReader(isr);
     
     int n=Integer.parseInt(br.readLine());
     int a=0;
     int b=1;
     int s=0;
     int c=0;
     int i;
     s=s+a+b;
     
     for(i=2;i<=n;i++)
     {
         c=a+b;
         
         a=b;
         b=c;
         s=s+c;
        }
        
        System.out.println(s);
    }
}