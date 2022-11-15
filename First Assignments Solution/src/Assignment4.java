import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Assignment4 {
    public static void main(String[] args) {
        int a,b,result;
        char o;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        a = input.nextInt();
        System.out.println("Enter your second number: ");
        b = input.nextInt();
        System.out.print(
                "Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        o = input.next().charAt(0); // taking input for a single charecter
        if(o=='+')
        {
            System.out.println("Addition: "+(a+b));
        }
        else if(o=='-')
        {
            System.out.println("Subtraction: "+(a-b));
        }
        else if(o=='*')
        {
            System.out.println("Multiplication: "+(a*b));
        }
        else if(o=='/')
            System.out.println("Division: "+(a/b));
        else if(o=='%')
            System.out.println("Remainder: "+(a%b));




    }
}
