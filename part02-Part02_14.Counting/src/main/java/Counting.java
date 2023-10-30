
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int num = Integer.valueOf(scanner.nextLine());



        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
        scanner.close();
    }
}
