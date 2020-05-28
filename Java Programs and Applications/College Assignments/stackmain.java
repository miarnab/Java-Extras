import java.io.*;
class stackmain
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String r="Y";
        System.out.println("Enter the size of the stack:");
        int size1=Integer.parseInt(br.readLine());
        stack ob=new stack(size1);
        while(r.equalsIgnoreCase("Y"))
        {
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Display");
        System.out.println("Enter the user's choice:");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
        case 1:System.out.println("Enter the item to insert:");
                int item1=Integer.parseInt(br.readLine());
                ob.push(item1);
                break;
        case 2:ob.pop();
                break;
        case 3:ob.display();
                break;
        default:System.out.println("Wrong Choice");
    }
        System.out.println("Enter Y to continue");
        r=br.readLine();
    }
}
}