// Exercise 7-3

import java.util.HashMap;
import java.util.Scanner;

public class ch7exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var nations = new HashMap<String, Integer>();

        System.out.println("나라 이름과 인구를 입력하세요. (예: Korea 5000)");
        while(true) {
            System.out.print("나라 이름, 인구 >> ");
            String input = scanner.nextLine();
            if(input.equals("그만")) {
                break;
            }
            
            String [] s = input.split(" ");
            nations.put(s[0], Integer.parseInt(s[1]));
        }

        while(true) {
            System.out.print("인구 검색 >> ");
            String input = scanner.nextLine();
            if(input.equals("그만")) {
                break;
            }

            Integer population = nations.get(input);
            if(population == null) {
                System.out.println(input + " 나라는 없습니다.");
                continue;
            }

            System.out.println(input + "의 인구는 " + population);
        }

        scanner.close();
    }
}
