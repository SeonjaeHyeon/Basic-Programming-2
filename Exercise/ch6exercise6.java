// Exercise 6-6

import java.util.Calendar;
import java.util.Scanner;

public class ch6exercise6 {
    public static void main(String[] args) {
        int now_sec;
        int after_sec;
        Calendar now;
        Calendar after;

        Scanner scanner = new Scanner(System.in);

        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");

        System.out.print("황기태 시작 <Enter>키>>");
        scanner.nextLine();
        now = Calendar.getInstance();
        now_sec = now.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = " + now_sec);
        System.out.println("10초 예상 후 <Enter>키>>");
        scanner.nextLine();
        after = Calendar.getInstance();
        after_sec = after.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = " + after_sec);

        int result1 = after_sec - now_sec;
        if(now_sec > after_sec) {
            result1 += 60;
        }

        System.out.print("이재문 시작 <Enter>키>>");
        scanner.nextLine();
        now = Calendar.getInstance();
        now_sec = now.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = " + now_sec);
        System.out.println("10초 예상 후 <Enter>키>>");
        scanner.nextLine();
        after = Calendar.getInstance();
        after_sec = after.get(Calendar.SECOND);
        System.out.println("\t현재 초 시간 = " + after_sec);

        int result2 = after_sec - now_sec;
        if(now_sec > after_sec) {
            result2 += 60;
        }

        System.out.print("황기태의 결과 " + result1 + ", 이재문의 결과 " + result2 + ", ");
        result1 = Math.abs(10 - result1);
        result2 = Math.abs(10 - result2);

        if(result1 == result2) {
            System.out.println("비겼습니다.");
        }
        else if(result1 > result2) {
            System.out.println("승자는 이재문");
        }
        else {
            System.out.println("승자는 황기태");
        }

        scanner.close();
    }
}
