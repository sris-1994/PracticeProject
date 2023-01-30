package practice;

public class FibSeriesWithRecursion {
    static int a = 0, b = 1, c;
    public static void main(String[] args) {
        System.out.println(a+ " " +b);
        FibSeriesWithRecursion obj = new FibSeriesWithRecursion();
        obj.fib(10);
    }
    void fib(int i){
        if(i>1){
            c = a+b;
            System.out.print(" " +c);
            a = b;
            b = c;
            fib(i-1);
        }
    }
}
