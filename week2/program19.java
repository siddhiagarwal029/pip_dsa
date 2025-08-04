package week2;

public class program19 {
    public static int fun(int n) {
        if (n==1) {
            return 1;
        }
        return n*fun(n - 1)+fun(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fun(3));
    }
}
