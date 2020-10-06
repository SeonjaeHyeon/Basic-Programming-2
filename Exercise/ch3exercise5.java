// Exercise 3-5

import java.util.Scanner;

public class ch3exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[10];

        System.out.print("양의 정수 10개를 입력하시오>>");
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.print("3의 배수는");
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 3 == 0) {
                System.out.print(" " + input[i]);
            }
        }

        scanner.close();
    }    
}
