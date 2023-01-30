package chapter04;

import java.util.Scanner;

//While Loop
public class GrossPayInputValidation {
    public static void main(String[] args) {
//        initialize the value
        int rate = 15;
        int maxHours = 40;
//        Get input for unknown
        System.out.println("How many hrs did you work in this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
//        Validate Input
        while(hoursWorked > maxHours){
            System.out.println("Invalid entry. Your hours must be between 1 and 40");
            hoursWorked = scanner.nextDouble();
        }
    scanner.close();
        //    calculate gross
        double gross = rate * hoursWorked;
        System.out.println("Gross Pay is $" +gross);
    }


}
