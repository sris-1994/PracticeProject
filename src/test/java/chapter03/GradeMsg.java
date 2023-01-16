package chapter03;
//Switch statement checks for equality
import java.util.Scanner;

public class GradeMsg {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message;
        switch(grade){
            case "A":
                message = "Excellent job!";
             break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "you need to work hard";
                break;
            case "F":
                message = "Opps Sorry!";
                break;
            default:
                message = "Error. Invalid gread";
                break;
        }
        System.out.println(message);
    }
}
