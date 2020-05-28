import java.io.*;
class main2
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the side of the cube:");
        double a1=Double.parseDouble(br.readLine());
        System.out.println("Enter the radius of the cylinder:");
        double r1=Double.parseDouble(br.readLine());
        System.out.println("Enter the height of the cylinder:");
        double h3=Double.parseDouble(br.readLine());
        System.out.println("Enter the length of the rectangular box:");
        double l1=Double.parseDouble(br.readLine());
        System.out.println("Enter the breadth of the rectangular box:");
        double b1=Double.parseDouble(br.readLine());
        System.out.println("Enter the height of the rectangular box:");
        double h4=Double.parseDouble(br.readLine());
        volume ob=new volume();
        ob.volume(a1);
        ob.volume(r1,h3);
        ob.volume(l1,b1,h4);
    }
}