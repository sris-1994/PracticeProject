package practice;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String inputStr = sc.nextLine();
        if(isPalindrome(inputStr)){
            System.out.println("The input string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }

    }
    public static boolean isPalindrome(String str){
        int leftSide = 0;
        int rightSide = str.length()-1;
        while(leftSide<rightSide){
            if(str.charAt(leftSide) !=str.charAt(rightSide)){
                return false;
            }
            leftSide++;
            rightSide--;
        }
        return true;
    }
}
