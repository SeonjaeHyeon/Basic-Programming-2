// Exercise 2-9

import java.util.Scanner;

public class ch2exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        float circle_x = scanner.nextFloat();
        float circle_y = scanner.nextFloat();
        float circle_r = scanner.nextFloat();

        System.out.print("점 입력>>");
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        float result_square = (circle_x - x) * (circle_x - x) + (circle_y - y) * (circle_y - y);

        if(result_square < circle_r * circle_r) {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있다.");
        }
        else {
            System.out.println("점 (" + x + ", " + y + ")는 원 안에 있지 않다.");
        }

        scanner.close();
    }
}
