package chapter02;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
//        1. Numbers of hrs worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
//        2. hourly pay rate
        System.out.println("Enter the employee pay rate");
        double rate = scanner.nextDouble();
        scanner.close();
//        3. Multiply hrs and pay rate
        double grossPay = hours*rate;
//        4. Display result
        System.out.println("Employee gross pay is $"+grossPay);
    }
}
