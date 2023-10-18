
import java.util.Scanner;

public class NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numofnums = 0;
        int num = 0;
        while (true) {
            System.out.println("Give a number: ");
            num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                numofnums = numofnums +1;
                sum = sum + num;
            }
        }
        System.out.println("Number of numbers: " + numofnums);
        System.out.println("Sum of the numbers: " + sum);
        scanner.close();
    }
}
