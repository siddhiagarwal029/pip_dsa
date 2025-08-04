package week2;
public class program4 {
    public static void fun(int x) {
        if (x == 0) {
            return;
        }
        fun(x - 1);
        System.out.println(x);
    }

    public static void main(String[] args) {
        fun(3);
    }
}

