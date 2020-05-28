import java.util.Scanner;
class exceptionhandling
{
    static String a;
    static String f="India";
    public static void main(String args[])
    {
        System.out.println("Enter the word:");
        Scanner s=new Scanner(System.in);
        try
        {
            a=s.next();
            find(f);
            System.out.println("The word is:"+a);
        }
        catch(NoMatchException e)
        {
            System.out.println("Word not equal to India"+e);
        }
    }
    static void find(String f) throws NoMatchException
    {
        if(!f.equals(a))
            throw new NoMatchException("Not Matched");
        }
    }

            