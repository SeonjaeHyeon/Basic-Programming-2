// Open Challenge 4

import java.util.Scanner;

class Player {
    private String name;
    private String word;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getWordFromUser() {
        System.out.print(this.name + ">>");
        this.word = scanner.next();

        return this.word;
    }

    public boolean checkSuccess(String s) {
        int lastIndex = s.length() - 1;
        char lastChar = s.charAt(lastIndex);
        char firstChar = this.word.charAt(0);

        if(lastChar == firstChar) {
            return true;
        }

        System.out.println(this.name + "이/가 졌습니다.");
        return false;
    }
}

public class ch4challenge {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int people = scanner.nextInt();

        Player [] p;
        p = new Player[people];
        for(int i = 0; i < p.length; i++) {
            System.out.print("참가자의 이름을 입력하세요>>");
            input = scanner.next();

            p[i] = new Player(input);
        }

        System.out.println("시작하는 단어는 아버지입니다.");
        String preword = "아버지";
        String postword;
        boolean isSuccess = true;

        while(isSuccess) {
            for(int i = 0; i < p.length; i++) {
                postword = p[i].getWordFromUser();
                isSuccess = p[i].checkSuccess(preword);

                if(!isSuccess) {
                    break;
                }

                preword = postword;
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        System.out.println("끝말잇기 게임을 시작합니다...");
        
        run();
    }
}
