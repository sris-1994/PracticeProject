package practice;

import java.util.HashMap;
import java.util.Map;

public class CountNoOfRepeatWords {
    static void characterCount(String inputString){
        HashMap<Character,Integer> countLetters = new HashMap<Character,Integer>();
        char [] strArray = inputString.toCharArray();
        for(char c: strArray){
            if(countLetters.containsKey(c)){
                countLetters.put(c, countLetters.get(c)+1);
            }
            else{
                countLetters.put(c,1);
            }
        }
        for (Map.Entry entry: countLetters.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }

    public static void main(String[] args) {
        characterCount("Srishti Panda");
    }
}
