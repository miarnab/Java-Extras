import java.io.*;
class filehandling
{
    static String fileName=("student.txt");
    static InputStreamReader isr=new InputStreamReader(System.in);
    static BufferedReader br=new BufferedReader(isr);
    public static void main(String args[])throws IOException
    {
        try
        {
            FileWriter fw=new FileWriter("student.txt");
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter outFile=new PrintWriter(bw);
            System.out.println("Enter the name of the student:");
            String name=br.readLine();
            System.out.println("Enter the roll number of the student:");
            double rollno=Double.parseDouble(br.readLine());
            System.out.println("Enter the number of subjects:");
            int n=Integer.parseInt(br.readLine());
            int marks[]=new int[n];
            System.out.println("Enter the marks of"+" "+n+" "+"subjects:");
            for(int i=0;i<n;i++)
            {
               marks[i]=Integer.parseInt(br.readLine());
               outFile.println(marks[i]);
            }
            outFile.close();
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}