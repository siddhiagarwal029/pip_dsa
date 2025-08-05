package week2;
public class program21 {
    public static int modify(int x){
        x=x+10;
        return x;
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(modify(a));
        System.out.println(a);
    }
}
