package week2;

public class program34 {
    public static int recU(int a){
        if(a>10){
            return a;

        }
        return recU(a+2);
    }
    public static void main(String[] args) {
        System.out.println(recU(4));
    }
}
