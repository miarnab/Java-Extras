import java.io.*;
class worker extends employee
{ int ndays;
    double wages;
    double tsal;
    worker()
    {
        ndays=0;
        wages=0.00;
        tsal=0.00;
    }
    worker(String name3,int age3,String address3,int ndays1,double wages1)
    {
        super(name3,age3,address3);
        ndays=ndays1;
        wages=wages1;
    }
    void display()
    {
        tsal=wages*ndays;
        super.display();
        System.out.println("The total salary of the worker is:"+tsal);
    }
}
        