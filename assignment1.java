import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
        System.out.print("Input your number: ");
        a = in.nextInt();
        if(a%2==0)
            System.out.println("This is a even number");
        else
            System.out.println("This is odd number");


    }



}
