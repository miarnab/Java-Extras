import java.io.*;
class armstrongmain
{public static void main(String args[])throws IOException
    {
       armstrong ob=new armstrong();
        ob.input();
        boolean res=ob.check();
        if(res==true)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not an Armstrong Number");
    }
}