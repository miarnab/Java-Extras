import java.io.*;
class manager extends employee
{ String depart;
    double sal;
    manager()
    {
        depart=" ";
        sal=0.00;
    }
    manager(String name2,int age2,String address2,String depart1,double sal1)
    {
        super(name2,age2,address2);
        depart=depart1;
        sal=sal1;
    }
    void display()
    {
        super.display();
        System.out.println("The department of the manager is:"+depart);
        System.out.println("The saalary of the manager is:"+sal);
    }
}