package week2;

public class program10 {
    public static void reverse(int n) {
        if(n==0){
            return;
        }
        System.out.print(n);
        reverse(n-1);
    }
    public static void main(String[] args) {
        reverse(3);
    }
}
