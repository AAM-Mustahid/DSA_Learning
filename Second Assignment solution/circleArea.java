import java.util.Scanner;

public class circleArea {
    //static double pi = 3.1416;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your radius: ");
        int r = input.nextInt();
        double result = Math.PI*(r*r);
        System.out.println("Area: "+result);


    }
}
