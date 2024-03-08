package practice;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int array [] = {7,8,10,20,11,6};
        Arrays.sort(array);
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
