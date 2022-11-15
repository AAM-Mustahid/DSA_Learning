import java.util.Scanner;

public class infinityMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0,number;
        while((number= input.nextInt())!=0)
        {
            if(number>max)
                max = number;


        }
        System.out.println("max number is: "+max);
    }
}
