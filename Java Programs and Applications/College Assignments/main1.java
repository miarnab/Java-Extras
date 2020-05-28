import java.io.*;
class main1
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the name of the manager:");
        String name4=br.readLine();
        System.out.println("Enter the age of the manager:");
        int age4=Integer.parseInt(br.readLine());
        System.out.println("Enter the address of the manager:");
        String address4=br.readLine();
        System.out.println("Enter the department of the manager:");
        String depart2=br.readLine();
        System.out.println("Enter the salary of the manager:");
        double sal2=Double.parseDouble(br.readLine());
        System.out.println("Enter the name of the worker:");
        String name5=br.readLine();
        System.out.println("Enter the age of the worker:");
        int age5=Integer.parseInt(br.readLine());
        System.out.println("Enter the address of the worker:");
        String address5=br.readLine();
        System.out.println("Enter the number of days worked of the worker:");
        int ndays2=Integer.parseInt(br.readLine());
        System.out.println("Enter the daily wages of the worker:");
        double wages2=Double.parseDouble(br.readLine());
        manager ob1=new manager(name4,age4,address4,depart2,sal2);
        worker ob2=new worker(name5,age5,address5,ndays2,wages2);
        ob1.display();
        ob2.display();
    }
}