import java.io.File;
import java.io.FileInputStream;
public class ReadFile
{public static void main(String args[])
    {
        String fileName="input.txt";
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                System.out.println("File cannot exist");
                System.exit(0);
            }
            String text;
            int val;
            FileInputSttream file=new FileInputStream(objFile);
            System.out.println("Content of the file is:");
            while(val=fileIn.read()!=-1)
            {
                System.out.println((char)val);
            }
            System.out.println();
            fileIn.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}