import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class assignment3 {
    public static void main(String[] args) {
        double principal,rate;
        int time;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your principal : ");
        principal = input.nextDouble();
        System.out.println("Year Given: ");
        time = input.nextInt();
        System.out.println("Rate: ");
        rate = input.nextInt();
     result = principal*(1+((rate/100)*time));
        System.out.println(result+"you must pay ");


    }



}

