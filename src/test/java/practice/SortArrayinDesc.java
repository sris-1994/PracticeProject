package practice;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayinDesc {
    public static void main(String[] args) {
        Integer array[] = {1,2,3,4,5,6};
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
