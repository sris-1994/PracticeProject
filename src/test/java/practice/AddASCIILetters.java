package practice;

import java.util.Scanner;

public class AddASCIILetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputStr = sc.nextLine();
        int sum = 0;
        for(int i = 0; i<inputStr.length(); i++){
            sum+= inputStr.charAt(i);
        }
        System.out.println("The Ascii value sum  of " +inputStr+ " is " +sum);
    }
}
