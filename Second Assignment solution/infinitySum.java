import java.util.Scanner;

public class infinitySum {
    public static void main(String[] args) {
        int sum=0;

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        while(number!=0){
            sum+=number;
            number = input.nextInt();
        }
        System.out.println("Total Sum is: "+sum);
    }
}
