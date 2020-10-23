// Exercise 6-7

import java.util.Scanner;
import java.util.StringTokenizer;

public class ch6exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("StringTokenizer 이용");
        while(true) {
            System.out.print(">>");
            String input = scanner.nextLine();

            if(input.equals("그만")) {
                break;
            }

            StringTokenizer str_token = new StringTokenizer(input, " ");
            System.out.println("어절의 개수는 " + str_token.countTokens());
        }

        System.out.println("String 클래스의 split() 이용");
        while(true) {
            System.out.print(">>");
            String input = scanner.nextLine();

            if(input.equals("그만")) {
                break;
            }

            String [] str = input.split(" ");
            System.out.println("어절의 개수는 " + str.length);
        }

        scanner.close();
    }
}
