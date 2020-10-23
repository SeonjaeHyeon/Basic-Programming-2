// Exercise 6-8

import java.util.Scanner;

public class ch6exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String input = scanner.nextLine();

        for(int i = 1; i < input.length(); i++) {
            System.out.print(input.substring(i));
            System.out.println(input.replace(input.substring(i), ""));
        }

        System.out.println(input);

        scanner.close();
    }
}
