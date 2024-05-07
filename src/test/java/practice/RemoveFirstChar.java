package practice;

import java.util.Scanner;

public class RemoveFirstChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the required string");
        String inputStr = sc.nextLine();
        System.out.println("Enter the character to be removed ");
        char removeFirstChar = sc.next().charAt(0);
        int removeIndex = inputStr.indexOf(removeFirstChar);
        if(removeIndex != -1){
            inputStr = inputStr.substring(0, removeIndex) + inputStr.substring(removeIndex +1);
        }
        System.out.println("The out put is " +inputStr);
    }
}
