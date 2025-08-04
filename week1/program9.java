public class program9 {
    public static void main(String[] args) {
        int value = 2;
        int sum = 0;
        while (value <= 10) {
            sum += value;
            value += 2;
        }
        System.out.println("Sum: " + sum);
    }
}
