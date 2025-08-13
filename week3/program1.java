package week3;

import java.util.Scanner;

class program1 {

    public int findStringCode(String input1) {
        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            word = word.toUpperCase();
            int sum = 0;
            int i = 0, j = word.length() - 1;

            while (i <= j) {
                int left = word.charAt(i) - 'A' + 1;
                int right = word.charAt(j) - 'A' + 1;

                if (i == j) {
                    sum += left;
                } else {
                    sum += Math.abs(left - right);
                }
                i++;
                j--;
            }
            result.append(sum);
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        program1 obj = new program1();
        int code = obj.findStringCode(input);

        System.out.println("String Code: " + code);
        sc.close();
    }
}
