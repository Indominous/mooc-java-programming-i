
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        int sumoftwonumbers = first + second;
        double AverageOfTwoNumbers =  1.0 * sumoftwonumbers / 2;
        System.out.println("The average is " + AverageOfTwoNumbers);

    }
}
