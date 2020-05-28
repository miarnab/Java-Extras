import java.io.*;
class binaddmain
{public static void main(String args[])throws IOException
{
binadd ob1=new binadd();
binadd ob2=new binadd();
binadd ob3=new binadd();
binadd ob4=new binadd();
ob1.accept();
ob2.accept();
ob1.show();
System.out.println("+");
ob2.show();
ob4=ob3.addition(ob1,ob2);
System.out.println("=");
ob4.show();
}
}