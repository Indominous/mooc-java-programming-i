
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double gifttax = 0;
        if(value > 1000000){
            gifttax = (142100 + (value - 1000000) * 0.17);
            System.out.println("Tax: "+ gifttax);
        }else if(value < 1000000 && value > 200000){
            gifttax = (22100 + (value - 200000) * 0.15);
            System.out.println("Tax: "+ gifttax);
        }else if(value < 200000 && value > 55000){
            gifttax = (4700 + (value - 55000) * 0.12);
            System.out.println("Tax: "+ gifttax);
        }else if(value <= 55000 && value > 25000){
            gifttax = (1700 + (value - 25000) * 0.1);
            System.out.println("Tax: "+ gifttax);
        }else if(value < 25000 && value > 5000){
            gifttax = (100 + (value - 5000) * 0.08);
            System.out.println("Tax: "+ gifttax);
        }else{
            System.out.println("No tax!");
        }
        scan.close();
    }
} 
    
