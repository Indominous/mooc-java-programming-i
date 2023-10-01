
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String StringInput = (scan.nextLine());
        System.out.println("Give an integer: ");
        int IntegerInput = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double doubleinput = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean BooleanInput = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+ StringInput );
        System.out.println("You gave the integer " + IntegerInput);
        System.out.println("You gave the double "  + doubleinput);
        System.out.println("You gave the boolean " + BooleanInput);
        

    }
}
