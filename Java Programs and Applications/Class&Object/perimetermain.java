import java.io.*;
class perimetermain
{public static void main(String args[])throws IOException
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    perimeter ob=new perimeter();
    System.out.println("Enter the side of the square:");
    int s=Integer.parseInt(br.readLine());
    System.out.println("Enter the length and breadth of the rectangle:");
    int l=Integer.parseInt(br.readLine());
    int b=Integer.parseInt(br.readLine());
    int res1=ob.peri(s);
    int res2=ob.peri(l,b);
    System.out.println("The perimeter of the square:"+res1);
    System.out.println("The perimeter of the rectangle:"+res2);
}
}