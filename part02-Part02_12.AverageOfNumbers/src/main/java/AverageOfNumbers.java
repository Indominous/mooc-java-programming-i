
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double numofnums = 0;
        double num = 0;
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
        double average = sum / numofnums;
        System.out.println("Average of the numbers: " + average);
        scanner.close();
    }
}
