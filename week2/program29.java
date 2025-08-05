package week2;

public class program29 {
    static int x=1;
    public static void outer(){
        int x=2;
        inner(x);
    }

    public static void inner(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        outer();
    }
}
