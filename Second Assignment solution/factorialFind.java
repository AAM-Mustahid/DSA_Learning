import java.util.Scanner;

public class factorialFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        int i ,fact=1;
        for ( i = number; i >=1 ; i--) {
            fact*=i;
}
        System.out.println("Here total factorial is "+fact);


    }

}
