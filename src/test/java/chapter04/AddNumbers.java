package chapter04;

import java.util.Scanner;

//Do while loop
public class AddNumbers {
    public static void main(String[] args) {
        boolean again = false;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Enter 1st number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter 1st number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is " +sum);

            System.out.println("Would you like to start over");
            again = scanner.nextBoolean();
        }while(again);
        scanner.close();
    }
}
