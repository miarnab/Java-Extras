import java.io.*;
class Class1{
static int i=0;
public static void main(String args[]){
    for(int j=0;j<args.length;j+=2){
        i+=Integer.parseInt(args[j]);
    }
    System.out.println(i);
}
}