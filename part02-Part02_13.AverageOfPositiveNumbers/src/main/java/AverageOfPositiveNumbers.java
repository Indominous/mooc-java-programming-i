
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int num = 0;
        while (true) {
            System.out.println("");
            num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0){
                break;
            } else if(num > 0){
                count = count + 1;
                sum = sum + num;
            } else if(num < 0){
                continue;
            }
        }
        if(count != 0){
            double average = 1.0 * sum/count;
            System.out.println(average);
        }else{
            System.out.println("Cannot calculate the average");
        }
        scanner.close();
    }
}
