import java.util.Scanner;

//Input currency in Taka and output in USD
public class Assignment6 {
    public static void main(String[] args) {
        int taka;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Currency(Taka)");
        taka  = input.nextInt();
        double dollar = taka*101.85;
        System.out.println("Dollar: "+dollar);

    }
}
