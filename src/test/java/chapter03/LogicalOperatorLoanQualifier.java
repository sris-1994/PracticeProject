package chapter03;

import java.util.Scanner;

/*
NESTED IFS:
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
//        Initialize values
        int requiredSalary = 30000;
        int requiredYearsOfEmployed = 2;

//        Get un known values
        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();

//        Make a decision of giving loan - Out put
        if(salary >= requiredSalary && years >= requiredYearsOfEmployed){
            System.out.println("Congrats! You qualify for the Loan");
            }
        else{
            System.out.println("Opps! You must have atleast $" +requiredSalary+ " to qualify for loan");
        }
    }
}
