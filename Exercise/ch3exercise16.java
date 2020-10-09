// Exercise 3-16

import java.util.Scanner;

public class ch3exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] str = {"가위", "바위", "보"};

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        String input;
        int n;
        while(true) {
            System.out.print("가위 바위 보!>>");
            input = scanner.next();
            n = (int)(Math.random()*3); // 0 ~ 2

            if(input.equals("그만")) {
                System.out.println("게임을 종료합니다..");
                break;
            }

            if(str[n].equals(input)) {
                System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 비겼습니다.");
            }
            else if(str[n].equals("가위")) {
                if(input.equals("바위")) {
                    System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
                else if(input.equals("보")) {
                    System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
                }
            }
            else if(str[n].equals("바위")) {
                if(input.equals("보")) {
                    System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
                else if(input.equals("가위")) {
                    System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
                }
            }
            else if(str[n].equals("보")) {
                if(input.equals("가위")) {
                    System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 사용자가 이겼습니다.");
                }
                else if(input.equals("바위")) {
                    System.out.println("사용자 = " + input + ", 컴퓨터 = " + str[n] + ", 컴퓨터가 이겼습니다.");
                }
            }
        }
        scanner.close();
    }
}
