package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("cat");
        a1.add("zebra");
        a1.add("elephant");
        a1.add("apple");
        a1.add("rat");
//        Collections.sort(a1);
        Collections.sort(a1,Collections.reverseOrder());
        System.out.println("List after sorting " +a1);
    }
}
