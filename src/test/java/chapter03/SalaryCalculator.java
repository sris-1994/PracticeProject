package chapter03;

import java.util.Scanner;

/*
IF Statement
All sales people get a payment of $100 a week
Sales people who exceed 10 sales get and additional bonus of $250
 */
public class SalaryCalculator {
    public static void main(String[] args) {
//        Initialize know values
        int salary = 1000;
        int bonus = 250;
//        Get values for the unknow
        System.out.println("How many sales did the employee mark this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
//        Quick de tour for the bonus earners
        if(sales > 10){
            salary = salary + bonus;
        }
//        output
        System.out.println("Employee pay is $"+salary );
    }
}
