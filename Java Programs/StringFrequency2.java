import java.util.*;
public class StringFrequency2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        int l=s.length();
        int freq[]=new int[l];
        int i,j;
        char string[]=s.toCharArray();
        for(i=0;i<l;i++){
            freq[i]=1;
            for(j=i+1;j<l;j++){
                if(string[i]==string[j]){
                    freq[i]++;
                    string[j]='0';
                }
            }
        }
        System.out.println("The characters and their frequencies are: ");
        for(i=0;i<freq.length;i++){
            if(string[i]!=' ' && string[i]!= '0'){
                System.out.println(string[i]+ "-" +freq[i]);
            }
        }
    }
}
