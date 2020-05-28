import java.io.*;
class creation_binary_file
{public static void main(String args[])throws IOException
{
 InputStreamReader isr=new InputStreamReader(System.in);
 BufferedReader br=new BufferedReader(isr);
 //creation of binary file buffers
 FileOutputStream fos=new FileOutputStream("info.dat");
 DataOutputStream dos=new DataOutputStream(fos);
 String nam,pan;
 int ch;
 double taxincome;
 do
 {
  System.out.println("Enter name,pan number,taxable income");
  nam=br.readLine();
  pan=br.readLine();
  taxincome=Double.parseDouble(br.readLine());
  dos.writeUTF(nam);
  dos.writeUTF(pan);
  dos.writeDouble(taxincome);
  System.out.println("Input More?1 for yes 0 for no");
  ch=Integer.parseInt(br.readLine());
}
while(ch==1);
fos.close();
dos.close();
}
}
