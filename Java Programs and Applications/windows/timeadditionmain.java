import java.io.*;
class timeadditionmain
{public static void main(String args[])throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
time t1=new time();
time t2=new time();
t1.accept();
t2.accept();
t1.addtime(t1,t2);
}
}  