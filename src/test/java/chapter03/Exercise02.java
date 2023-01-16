package chapter03;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
//        initialize the value
        int changes = 1;
//        get the count of coins
        System.out.println("How many pennies do you need");
        Scanner scanner = new Scanner(System.in);
        int numberOfPennies = scanner.nextInt();
        System.out.println("How Many nickels do you need");
        int numberOfNickels = scanner.nextInt();
        System.out.println("How Many dimes do you need");
        int numberOfDimes = scanner.nextInt();
        System.out.println("How Many quarters do you need");
        int numberOfQuarters = scanner.nextInt();
        scanner.close();

//        Count all the changes
        int totalChangesCount = numberOfPennies * numberOfNickels * numberOfDimes * numberOfQuarters;
        int finalChanges = changes - totalChangesCount;

//        Make decision
        if (totalChangesCount == 1){
            System.out.println("Congratulatios! You own the game");
        } else if (totalChangesCount < 1) {
            System.out.println("OOps! You are shot of "+finalChanges+ " changes");
        } else if (totalChangesCount > 1) {
            System.out.println("OOps! You went over "+finalChanges+ " changes");
        }
    }
}
