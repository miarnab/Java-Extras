import java.io.*;
public class StringPallindrome1 {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the string: ");
        String s=br.readLine();
        int l=s.length();
        String s1="";
        int i;
        for(i=l-1;i>=0;i--){
            char c=s.charAt(i);
            s1=s1+c;
        }
        if(s.equalsIgnoreCase(s1)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not a Pallindrome");
        }
    }
}
