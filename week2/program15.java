package week2;

public class program15 {
    public static void f(int x){
        if(x<1) {
            return;
        }
        f(x/2);
        System.out.println(x);
    }
    public static void main(String[] args) {
        f(8);
    }
}
