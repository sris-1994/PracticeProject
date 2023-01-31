package practice;

import java.util.Scanner;

public class PrimeNoCheck {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if (count == 2){
            System.out.println("Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }

    }
}
