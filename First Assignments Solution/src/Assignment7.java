//Fibonacci series

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber =0;
        int secondNumber =1;
        int target, i=2,sum =0;
        System.out.println("Enter your target: ");
        target = input.nextInt();
        while(i<target)
        {
            sum = firstNumber+secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;
            i++;
        }
        System.out.println("Your Fibonacci series: "+sum);


    }



}
