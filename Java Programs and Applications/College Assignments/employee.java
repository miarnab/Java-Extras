import java.io.*;
class employee
{   String name;
    int age;
    String address;
    employee()
    {
        name=" ";
        age=0;
        address=" ";
    }
    employee(String name1,int age1,String address1)
    {
        name=name1;
        age=age1;
        address=address1;
    }
    void display()
    {
        System.out.println("The name of the employee is:"+name);
        System.out.println("The age of the employee is:"+age);
        System.out.println("The address of the employee is:"+address);
    }
}