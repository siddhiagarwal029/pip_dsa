package week2;

public class program13 {
    static int count = 0;

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        fun(n-1);
        System.out.println(n);
        count++;
    }
    public static void main(String[] args) {
        fun(2);
        System.out.println("Total recursive calls: " + count);
    }
}
