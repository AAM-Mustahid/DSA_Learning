import java.util.Scanner;

//palindrome check
public class Assignment8 {
    public static void main(String[] args) {
        String a,rev="";
        System.out.println("Input : ");
        Scanner in = new Scanner(System.in);
        a = in.nextLine();

        int length = a.length();
        for (int i = length-1; i >=0 ; i--) {
            rev+= a.charAt(i);

        }
       if(a.equals(rev))
            System.out.println(a+ " Palidrome String ");
       else
       {
           System.out.println((a+ " Not a Palindrom String "));
       }
    }


}
