// Exercise 3-6

import java.util.Scanner;

public class ch3exercise6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("금액을 입력하시오>>");
        int input = scanner.nextInt();

        for (int i = 0; i < unit.length; i++) {
            if ((int) input / unit[i] == 0) {
                continue;
            }

            System.out.println(unit[i] + "원 짜리 : " + (int) input / unit[i] + "개");
            input = input % unit[i];
        }

        scanner.close();
    }
}
