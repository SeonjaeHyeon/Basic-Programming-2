// Exercise 8-11

import java.io.*;
import java.util.*;

public class ch8exercise11 {
    public static void main(String[] args) {
        try {
            Scanner fScanner = new Scanner(new FileReader("words.txt"));
            var data = new Vector<String>();
            while(fScanner.hasNext()) {
                data.add(fScanner.nextLine());
            }
            fScanner.close();

            Scanner sc = new Scanner(System.in);
            System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다...");
            while(true) {
                System.out.print("단어>>");
                String word = sc.nextLine();
                if(word.equals("그만")) {
                    System.out.println("종료합니다...");
                    break;
                }

                var it = data.iterator();
                boolean isExist = false;
                while(it.hasNext()) {
                    String next = it.next();
                    if(next.lastIndexOf(word) == 0) {
                        isExist = true;
                        System.out.println(next);
                    }
                }
                if(!isExist) {
                    System.out.println("발견할 수 없음");
                }
            }

            sc.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        } catch(Exception e) {
            System.out.println("알 수 없는 오류");
        }
    }
}
