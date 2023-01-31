package practice;

import java.util.Scanner;

public class PrimeNo1toN {
    public static void main(String[] args) {
        int i, count;
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Prime numners between 1 to " +n+ " are ");
        for(int j = 2; j<=n; j++){
            count = 0;
            for(i = 1; i<=j; i++){
                if(j%i == 0){
                    count++;
                }
            }
            if(count == 2)
                System.out.print(j+ " ");
        }
    }
}
