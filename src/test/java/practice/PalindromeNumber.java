package practice;


import java.sql.SQLOutput;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int reverseNum = 0, reminder;
        System.out.println("Please enter the suitable number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int originalNum = num;
        while(num!=0){
            reminder = num % 10;
            reverseNum = reverseNum * 10 + reminder;
            num /= 10;
        }
        if(originalNum == reverseNum){
            System.out.println(reverseNum + " is palindrome");
        }
        else{
            System.out.println(reverseNum + " is note palindrome");
        }
    }
}
