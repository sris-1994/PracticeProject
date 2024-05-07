package practice;

import java.util.Arrays;

public class PrintMaxValue {
    public static void main(String[] args) {
        int [] arr = {15, 24, 48, 21, 43, 11, 79, 93};
        Arrays.sort(arr);
        int num = arr.length;
        System.out.println("First maximum number is " +arr[num - 1]);
        System.out.println("Second maximum number is " +arr[num - 2]);
    }
}
