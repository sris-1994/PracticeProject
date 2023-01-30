package practice;
//reverse string
public class ReverseString {
    public static void main(String[] args) {
        String str = "Java concept", rstr = "";
        for (int i = 0; i<str.length(); i++){
            rstr = str.charAt(i) + rstr;
        }
        System.out.println("The original string is " +str);
        System.out.println("The reversed string is " +rstr);
    }
}
