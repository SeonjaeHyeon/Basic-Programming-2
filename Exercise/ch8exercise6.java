// Exercise 8-6

import java.io.*;
import java.util.Scanner;

public class ch8exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String first = sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String second = sc.nextLine();

        sc.close();

        FileInputStream ffin = null;
        FileInputStream sfin = null;
        FileOutputStream fout = null;
        try {
            ffin = new FileInputStream(first);
            sfin = new FileInputStream(second);
            fout = new FileOutputStream("appended.txt");

            int c;
            while((c = ffin.read()) != -1) {
                fout.write((byte)c);
            }
            ffin.close();

            int c2;
            while((c2 = sfin.read()) != -1) {
                fout.write((byte)c2);
            }
            sfin.close();
            fout.close();

            System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장하였습니다.");            
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
