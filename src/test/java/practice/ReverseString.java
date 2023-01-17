package practice;
//reverse string
public class ReverseString {
    public static void main(String[] args) {
        String str = "Java concept", rstr = "";
        for (int i=str.length()-1; i>=0; i--){
            rstr = rstr+str.charAt(i);
        }
        System.out.println("The original string is " +str);
        System.out.println("The reversed string is " +rstr);
    }
}
