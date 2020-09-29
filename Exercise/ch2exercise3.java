// Exercise 2-3

import java.util.Scanner;

public class ch2exercise3 {
    public static void main(String[] args) {
        int quotient = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int input = scanner.nextInt();

        if (input > 50000) {
            quotient = input / 50000;
            input -= quotient * 50000;
        }
        System.out.println("오만원권 " + quotient + "매");
        quotient = 0;
        
        if (input > 10000) {
            quotient = input / 10000;
            input -= quotient * 10000;
        }
        System.out.println("만원권 " + quotient + "매");
        quotient = 0;

        if (input > 1000) {
            quotient = input / 1000;
            input -= quotient * 1000;
        }
        System.out.println("천원권 " + quotient + "매");
        quotient = 0;

        if (input > 100) {
            quotient = input / 100;
            input -= quotient * 100;
        }
        System.out.println("백원 " + quotient + "개");
        quotient = 0;

        if (input > 50) {
            quotient = input / 50;
            input -= quotient * 50;
        }
        System.out.println("오십원 " + quotient + "개");
        quotient = 0;

        if (input > 10) {
            quotient = input / 10;
            input -= quotient * 10;
        }
        System.out.println("십원 " + quotient + "개");
        quotient = 0;

        if (input > 0) {
            quotient = input;
            input -= quotient;
        }
        System.out.println("일원 " + quotient + "개");

        scanner.close();
    }
}
