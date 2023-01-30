package practice;


public class ReverseEachWord {
        public static void reverWordOfString(String inputString){
            String words[] = inputString.split(" ");
            String reverseString = "";
            for (int i =0; i<words.length; i++){
                String word = words[i];
                String reverseWord = "";
                for(int j = 0; j<word.length(); j++){
                        reverseWord = word.charAt(j) + reverseWord;
                }
                reverseString = reverseString + reverseWord + " ";
            }
            System.out.println(inputString);
            System.out.println(reverseString);

        }
    public static void main(String[] args) {

            reverWordOfString("Reverse each word of string");
    }
    }
