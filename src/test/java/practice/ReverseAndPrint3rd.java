package practice;

import java.util.Scanner;

public class ReverseAndPrint3rd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String inputString = sc.next();
        String reversedString = reverseString(inputString);
        System.out.println("Reverse string is " +reversedString);
        if(reversedString.length()>=5){
            char thirdElement = reversedString.charAt(2);
            char fifthElement = reversedString.charAt(4);
            System.out.println("Third element is " +thirdElement);
            System.out.println("Fifth element is " +fifthElement);
        }
        else{
            System.out.println("String is too short to reverse and print the element");
        }
    }
    public static String reverseString(String string){
        StringBuilder reversedString = new StringBuilder();
        for(int i=string.length()-1; i>=0; i--){
            reversedString.append(string.charAt(i));
        }
        return reversedString.toString();
    }
}
