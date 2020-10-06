// Exercise 3-4

import java.util.Scanner;

public class ch3exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String s = scanner.next();
        char c = s.charAt(0);

        int index = c - 'a';
        for (int i = index; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('a' + j));
            }
            if (i != 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
