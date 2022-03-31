import java.io.*;
public class StringPallindrome3 {
    public static void main(String args[])throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the number of inputs/strings: ");
        int n=Integer.parseInt(br.readLine());
        int i,j;
        System.out.println("Enter the strings: ");
        for(i=0;i<n;i++){
            String s=br.readLine();
            String s1="";
            int l=s.length();
            for(j=l-1;j>=0;j--){
                char c=s.charAt(i);
                s1=s1+c;
            }
            if(s.equalsIgnoreCase(s1)){
                System.out.println(s+"-"+"Pallindrome");
            }
            else{
                System.out.println(s+"-"+"Not a Pallindrome");
            }
        }
    }
}
