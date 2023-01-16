package chapter03;

import java.util.Scanner;

/*
IF ELSE
All the sales people are expected to make at least 10 sales each week
For those who do, they receive a congratulation msg
For those who don't, they are informed of how many sales they were short
 */
public class QuotaCalculator {
    public static void main(String[] args) {
//        Initialize the values
        int quota = 10;
//        Get values for un known
        System.out.println("Enter the number of sales you made this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
//        Make a decision on the path to take - out put
        if(sales >= quota){
            System.out.println("Congratulations! You have made your quota");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("Opps!You did not make your quota. You were "+salesShort+ " sales short");
        }
    }
}
