import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Base and Width: ");
        int base = input.nextInt();
        int width = input.nextInt();
        double area = .5*(base*width);

        System.out.println("the result is: "+area);

    }

    }


