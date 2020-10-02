// Exercise 2-11

import java.util.Scanner;

public class ch2exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("달을 입력하세요(1~12)>>");

        int input = scanner.nextInt();

        System.out.println("if-else문 이용");
        if(input >= 3 && input <= 5) {
            System.out.println("봄");
        }
        else if(input >= 6 && input <= 8) {
            System.out.println("여름");
        }
        else if(input >= 9 && input <= 11) {
            System.out.println("가을");
        }
        else if(input == 12 || input == 1 || input == 2 ) {
            System.out.println("겨울");
        }
        else {
            System.out.println("잘못입력");
        }

        System.out.println("switch문 이용");
        switch(input) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘못입력");
        }

        scanner.close();
    }
}
