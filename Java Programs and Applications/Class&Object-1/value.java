import java.io.*;
class value
{ double a;
    char b;
    char c;
    value()
    {
        a=0.0;
        b='d';
        c='c';
        
    }
    void accept(double x)
    {
        a=x;
       
    }
    void display(){
        System.out.println("The values are="+a+b+c);
    }
}