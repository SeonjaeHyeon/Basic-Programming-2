// Exercise 8-12

import java.io.*;
import java.util.*;

public class ch8exercise12 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
            System.out.print("대상 파일명 입력>> ");
            String path = sc.nextLine();

            Scanner fScanner = new Scanner(new FileReader(path));
            var data = new Vector<String>();
            while(fScanner.hasNext()) {
                data.add(fScanner.nextLine());
            }
            fScanner.close();

            while(true) {
                System.out.print("검색할 단어나 문장>> ");
                String search = sc.nextLine();
                if(search.equals("그만")) {
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    break;
                }

                for(int i = 0; i < data.size(); i++) {
                    String s = data.get(i);
                    if(s.contains(search)) {
                        System.out.printf("%4d", i);
                        System.out.println(": " + s);
                    }
                }
            }
        } catch(IOException e) {
            System.out.println("입출력 오류");
        } catch(Exception e) {
            System.out.println("알 수 없는 오류");
        }
    }
}
