// Exercise 2-10

import java.util.Scanner;

public class ch2exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] first_circle = new int[3];
        int[] second_circle = new int[3];

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        for(int i = 0; i < first_circle.length; i++) {
            first_circle[i] = scanner.nextInt();
        }

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        for(int i = 0; i < second_circle.length; i++) {
            second_circle[i] = scanner.nextInt();
        }

        double r_distance = Math.sqrt((first_circle[0] - second_circle[0]) * (first_circle[0] - second_circle[0]) + (first_circle[1] - second_circle[1]) * (first_circle[1] - second_circle[1]));
        double r_sum = first_circle[2] + second_circle[2];

        if(r_distance <= r_sum) {
            System.out.println("두 원은 서로 겹친다.");
        }
        else {
            System.out.println("두 원은 서로 겹치지 않는다.");
        }

        scanner.close();
    }
}
