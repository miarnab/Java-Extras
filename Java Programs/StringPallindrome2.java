import java.util.*;
    public class StringPallindrome2 {
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string; ");
            String s=sc.nextLine();
            String s1="";
            int l=s.length();
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
