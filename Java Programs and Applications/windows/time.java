import java.io.*;
class time
{int hh,mm;
time()
{
hh=0;
mm=0;
}
void accept()throws IOException
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter hours and minutes");
hh=Integer.parseInt(br.readLine());
mm=Integer.parseInt(br.readLine());
}
void totime(int m)
{
int h;
h=m/60;
m=m%60;
System.out.println("Hour:"+h+"Minutes:"+m);
}
int tominute(time t)
{
int m=(t.hh)*60+t.mm;
return m;
}
void addtime(time t1,time t2)
{
int m1=tominute(t1);
int m2=tominute(t2);
int tt=m1+m2;
totime(tt);
}
}

 