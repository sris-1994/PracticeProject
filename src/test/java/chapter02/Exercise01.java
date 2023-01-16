package chapter02;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
//        1. Ask user a season
        System.out.println("Enter a season u like the most ");
        Scanner scanner = new Scanner(System.in);
        String seasonName = scanner.next();
//        2. Ask User a whole number
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();
//        3. Ask user an adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
//        4.Print the whole sentence
        System.out.println("On a " +adjective+ " " +seasonName+" day, I drink a minimum of "+number+" cups of coffee");
    }
}
