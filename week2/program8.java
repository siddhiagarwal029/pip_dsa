package week2;

public class program8 {
    static int count = 0;

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        count++;
        fun(n - 1);
        fun(n - 1);
    }

    public static void main(String[] args) {
        fun(3);
        System.out.println("Total recursive calls: " + count);
    }
}
