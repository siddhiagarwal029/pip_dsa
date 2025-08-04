package week2;

public class program2 {
    public static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + mystery(a, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(mystery(3,4));
    
}
}
