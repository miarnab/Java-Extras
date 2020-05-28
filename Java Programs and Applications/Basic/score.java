import java.io.*;
class score
{public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter the score:");
        int score=Integer.parseInt(br.readLine());
        String grade=" ";
if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else if (score >= 70) {
    grade = "C";
} else if (score >= 60) {
    grade = "D";    
} else {
    grade = "F";
}
System.out.println(grade);
}
}