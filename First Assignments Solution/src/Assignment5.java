import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Number: ");
        a = input.nextInt();
        System.out.println("Enter your Second Number: ");
        b = input.nextInt();
        int result = Integer.max(a,b);
        System.out.println("Max value of Two Integer: "+result);
    }

}
