package week2;

public class program20 {
    public static int doublefact(int n){
        if(n<=0){
            return 1;
        }
        return n * doublefact(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(doublefact(5));
    }
}
