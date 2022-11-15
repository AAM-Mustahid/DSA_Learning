// check a number armstrong or not

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        int i, a,b,sum,remainder,digit;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();

        for ( i = a; i < b ; i++) {
            sum = digit=0;
            int ArmNumber = i;

            while(ArmNumber!=0)
            {
                ArmNumber/=10;
                digit++; // counting digits
            }
            ArmNumber = i;
            while(ArmNumber!=0)
            {
                remainder = ArmNumber%10;
                sum+= Math.pow(remainder,digit);
                ArmNumber/=10;

            }
            if(sum == i)
            {
                System.out.println(i+ " is a Armstrong Number ");
            }


        }


    }

}
