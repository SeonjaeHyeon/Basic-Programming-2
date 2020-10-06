// Exercise 3-3

import java.util.Scanner;

public class ch3exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하시오>>");
        int input = scanner.nextInt();
        
        for (int i = input; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            if (i != 1) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
