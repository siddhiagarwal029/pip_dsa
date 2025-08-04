package week2;

public class program3 {
    public static int f(int n) {
        if(n == 0) {
            return 0;
        }
        return n + f(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(f(6));
    }
}
