public class program13 {
    public static void main(String[] args) {
        int x = 10, y = 4;
        int z = x * (x - y) % y / x;
        System.out.println("z = " + z);
    }
}
