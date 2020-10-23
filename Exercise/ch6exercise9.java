// Exercise 6-9

import java.util.Scanner;

public class ch6exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int random;
        while(true) {
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            input = scanner.nextInt();

            random = (int)(Math.random() * 10) / 3 + 1;

            if(input == 1) {
                System.out.print("철수(가위) : ");
                if(random == 1) {
                    System.out.println("컴퓨터(가위)");
                    System.out.println("비겼습니다.");
                }
                else if(random == 2) {
                    System.out.println("컴퓨터(바위)");
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                else {
                    System.out.println("컴퓨터(보)");
                    System.out.println("철수가 이겼습니다.");
                }
            }
            else if(input == 2) {
                System.out.print("철수(바위) : ");
                if(random == 1) {
                    System.out.println("컴퓨터(가위)");
                    System.out.println("철수가 이겼습니다.");
                }
                else if(random == 2) {
                    System.out.println("컴퓨터(바위)");
                    System.out.println("비겼습니다.");
                }
                else {
                    System.out.println("컴퓨터(보)");
                    System.out.println("컴퓨터가 이겼습니다.");
                }
            }
            else if(input == 3) {
                System.out.print("철수(보) : ");
                if(random == 1) {
                    System.out.println("컴퓨터(가위)");
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                else if(random == 2) {
                    System.out.println("컴퓨터(바위)");
                    System.out.println("철수가 이겼습니다.");
                }
                else {
                    System.out.println("컴퓨터(보)");
                    System.out.println("비겼습니다.");
                }
            }
            else {
                break;
            }
        }

        scanner.close();
    }
}
