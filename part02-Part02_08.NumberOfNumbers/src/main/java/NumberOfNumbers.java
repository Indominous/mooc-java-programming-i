
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int numberofnumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }else{
                numberofnumbers = numberofnumbers + 1;
            }
            
        }
        System.out.println("Number of numbers: " + numberofnumbers);
    }
}
