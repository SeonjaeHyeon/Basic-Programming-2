// Exercise 4-10

import java.util.Scanner;

class Dictionary {
    private static String [] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String [] eng = { "love", "baby", "money", "future", "hope" };

    public static String kor2Eng(String word) {
        for(int i = 0; i < kor.length; i++) {
            if(kor[i].equals(word)) {
                return eng[i];
            }
        }

        return null;
    }
}

public class ch4exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("한영 단어 검색 프로그램입니다.");

        String input;
        String result;
        while(true) {
            System.out.print("한글 단어?");
            input = scanner.next();

            if(input.equals("그만")) {
                break;
            }

            result = Dictionary.kor2Eng(input);
            if(result == null) {
                System.out.println(input + "은/는 저의 사전에 없습니다.");
            }
            else {
                System.out.println(input + "은/는 " + result);
            }
        }

        scanner.close();
    }
}
