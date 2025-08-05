package week2;

public class program35 {
    public static void f(int a, int b) {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" " + b);
    }
    public static void main(String[] args) {
        int x=3;
        int y=5;
        f(x,y);
        System.out.println(x+" " + y);
    }
}
