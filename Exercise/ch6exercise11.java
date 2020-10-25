// Exercise 6-11

import java.util.Scanner;

public class ch6exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(">>");
        StringBuffer sb = new StringBuffer(scanner.nextLine());

        while(true) {
            System.out.print("명령: ");
            String input = scanner.next();
            if(input.equals("그만")) {
                System.out.println("종료합니다");
                break;
            }

            String str [] = input.split("!");
            if(str.length != 2 || str[0].equals("") || str[1].equals("")) {
                System.out.println("잘못된 명령입니다!");
                continue;
            }
            
            String temp = new String(sb);
            if(!temp.contains(str[0])) {
                System.out.println("찾을 수 없습니다!");
                continue;
            }

            int index = sb.indexOf(str[0]);
            sb.replace(index, index + str[0].length(), str[1]);

            System.out.println(sb.toString());
        }

        scanner.close();
    }
}
