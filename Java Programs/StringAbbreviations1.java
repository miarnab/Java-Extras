import java.io.*;
public class StringAbbreviations1{
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the string/name: ");
        String s=br.readLine();
        int l=s.length();
        int i;
        char c=s.charAt(0);
        System.out.print(c+".");
        for(i=0;i<l;i++){
            char c1=s.charAt(i);
            if(c1==' '){
                System.out.print(s.charAt(i+1)+".");
            }
        }
    }
}