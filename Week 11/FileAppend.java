// 60201716 현선재

import java.io.*;
import java.util.Scanner;

public class FileAppend {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String first = sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String second = sc.nextLine();
        System.out.println("병합할 두 파일 사이에 개행 문자를 추가하시겠습니까?");
        System.out.print("(추가하려면 y 입력. 그렇지 않을 경우 Enter 입력)>>");
        String isNewline = sc.nextLine();
        
        sc.close();
        
        FileInputStream ffin = null;
        FileInputStream sfin = null;
        FileOutputStream fout = null;
        String fname = "append.txt";
        try {
            ffin = new FileInputStream(first);
            sfin = new FileInputStream(second);
            fout = new FileOutputStream(fname);
            
            int c;
            while((c = ffin.read()) != -1) {
                fout.write((byte)c);
            }
            ffin.close();
            
            if(isNewline.equals("y")) {
                // 개행 문자 입력.
                // 첫번째 파일의 마지막 줄과 두번째 파일의 첫번째 줄이 겹쳐지는 경우를 방지하기 위함.
                String newline = "\r\n";
                fout.write(newline.getBytes());
            }
            
            int c2;
            while((c2 = sfin.read()) != -1) {
                fout.write((byte)c2);
            }
            sfin.close();
            fout.close();
            
            System.out.println("프로젝트 폴더 밑에 " + fname + " 파일에 저장하였습니다.");
        } catch(IOException e) {
            System.out.println("파일 입출력 오류");
        } catch(Exception e) {
            System.out.println("알 수 없는 오류");
        }
    }

}
