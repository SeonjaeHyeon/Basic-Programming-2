// Exercise 2-1

import java.util.Scanner;

public class ch2exercise1 {
    public static void main(String[] args) {
        final float rate = 1100;
        Scanner scanner = new Scanner(System.in);

        System.out.print("원화를 입력하세요(단위 원)>>");
        int input = scanner.nextInt();

        System.out.println(input + "원은 $" + input / rate + "입니다.");

        scanner.close();
    }
}