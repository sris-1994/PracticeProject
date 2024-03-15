package practice;

import java.util.Scanner;

public class SplitAndReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = scanner.next();
        String requiredString = inputString.substring(0,6);
        String reversedString = reverseString(requiredString);
        System.out.println("Reversed string is "+reversedString);
    }
    public static String reverseString(String string){
        String reversedString = "";
        for(int i =0; i<string.length();i++){
            reversedString = string.charAt(i)+reversedString;
        }
        return reversedString.toString();
    }
}
