import java.util.Scanner;

//Take name as input and print a greeting message for that particular name
public class assignment2 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("INput a name:\"Mustahid,sazzad,anu\""); // (\) it is use for ignore after any symbols.
     String name = input.nextLine();
     if(name.equals("Mustahid") )
         System.out.println("Hi Mustahid");
     else if (name.equals("sazzad") )
         System.out.println("Hey sazzad how are you");
     else if(name.equals("Anu"))
         System.out.println("You are bitter. You know that");
     else
         System.out.println("hello You thats nice to meet you");


    }




}
