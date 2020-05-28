import java.io.*;
 class fibonacci_series1
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
     s=s+b;
     
     for(i=1;i<n;i++)
     {
         c=c+i;
         
        
         
        }
        s=s+c;
        System.out.println(s);
    }
}