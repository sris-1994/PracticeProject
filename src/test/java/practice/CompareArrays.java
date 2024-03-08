package practice;

import java.util.ArrayList;
import java.util.List;

public class CompareArrays{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,3,5,7,9,10};
        List<Integer> matchedElements = new ArrayList<>();
        List<Integer> unMatchedElements = new ArrayList<>();
        for(int element:arr1){
            if(contains(arr2,element)){
                matchedElements.add(element);
            }
            else{
                unMatchedElements.add(element);
            }
        }
        for (int element:arr2){
            if(!contains(arr1, element)){
                unMatchedElements.add(element);
            }
        }
        System.out.println("Matched elements "+matchedElements);
        System.out.println("Unmatched elements "+unMatchedElements);
    }
    public static boolean contains(int[] arr, int element){
        for (int value:arr){
            if(value == element){
                return true;
            }
        }
        return false;
    }
}
