
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstnum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondnum = Integer.valueOf(scanner.nextLine());
        int sum = firstnum + secondnum;
        int diff = firstnum - secondnum;
        int product = firstnum * secondnum;
        double quotient = 1.0 * firstnum / secondnum;
        System.out.println(firstnum + " + " + secondnum + " = " +sum );
        System.out.println(firstnum + " - " + secondnum + " = " +diff );
        System.out.println(firstnum + " * " + secondnum + " = " +product );
        System.out.println(firstnum + " / " + secondnum + " = " +quotient );
        
        

        

    }
}
