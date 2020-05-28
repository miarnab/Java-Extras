import java.io.*;
class fibo1
{public static void main(String args[])throws IOException
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int n=Integer.parseInt(br.readLine());
    int i,n1=0,n2=1,n3=0,sum;
    for(i=2;i<n;++i){
        n3=n1+n2;
        System.out.println(n1+n2+n3);
        n1=n2;
        n2=n3;
    }
    
    
}
}