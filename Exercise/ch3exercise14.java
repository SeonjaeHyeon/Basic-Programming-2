// Exercise 3-14

import java.util.Scanner;

public class ch3exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        String course [] = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
        int score [] = {95, 88, 76, 62, 55};

        String input;
        boolean inArray = false;
        while(true) {
            System.out.print("과목 이름>>");
            input = scanner.next();

            if(input.equals("그만")) {
                break;
            }

            for(int i = 0; i < course.length; i++) {
                if(course[i].equals(input)) {
                    inArray = true;
                    System.out.println(course[i] + "의 점수는 " + score[i]);
                    break;
                }
            }

            if(!inArray) {
                System.out.println("없는 과목입니다.");
            }

            inArray = false;
        }

        scanner.close();
    }
}
