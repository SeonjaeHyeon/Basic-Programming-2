// Exercise 7-12

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.Vector;

class Word {
    private String engWord;
    private String korWord;
    
    public Word(String eng, String kor) {
        this.engWord = eng;
        this.korWord = kor;
    }

    public String getEng() {
        return this.engWord;
    }

    public String getWord() {
        return this.korWord;
    }
}

public class ch7exercise12 {
    public static void main(String[] args) {
        String [] eng = {"painting", "bear", "eye", "picture", "society", "human", "love", "animal", "baby", "error", "doll", "trade", "statue", "emotion", "example", "honey", "stock"};
        String [] kor = {"그림", "곰", "눈", "사진", "사회", "인간", "사랑", "동물", "아기", "오류", "인형", "거래", "조각상", "감정", "보기", "꿀", "주식"};
        
        var scanner = new Scanner(System.in);
        var data = new Vector<Word>();

        for(int i = 0; i < eng.length; i++) {
            data.add(new Word(eng[i], kor[i]));
        }

        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
        while(true) {
            System.out.print("단어 테스트: 1, 단어 삽입: 2, 종료:3 >>");
            int num = scanner.nextInt();

            if(num == 1) {
                var rand = new Random();

                System.out.println("현재 " + data.size() + "개의 단어가 들어 있습니다. -1을 입력하면 종료합니다.");
                while(true) {
                    Collections.shuffle(data);
            
                    var select = new Vector<Word>();
                    for(int i = 0; i < 4; i++) {
                        select.add(data.get(i));
                    }

                    int ans = rand.nextInt(3) + 1;
                    System.out.println(select.get(ans - 1).getEng() + "?");
                    for(int i = 0; i < 4; i++) {
                        System.out.print("(" + (i + 1) + ")" + select.get(i).getWord() + " ");
                    }
                    System.out.print(":>");

                    int input = 0;
                    try {
                        input = scanner.nextInt();
                    } catch(InputMismatchException e) {
                        scanner.nextLine();
                        System.out.println("숫자를 입력하세요 !!");
                        continue;
                    }
                    
                    if(input == -1) {
                        break;
                    }
                    else if(input == ans) {
                        System.out.println("Excellent !!");
                    }
                    else {
                        System.out.println("No. !!");
                    }
                }
            }
            else if(num == 2) {
                System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                while(true) {
                    System.out.print("영어 한글 입력 >> ");
                    String english = scanner.next();
                    if(english.equals("그만")) {
                        break;
                    }

                    String korean = scanner.next();

                    data.add(new Word(english, korean));
                }
            }
            else if(num == 3) {
                System.out.println("\"명품영어\"를 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
