// Exercise 8-1

import java.io.*;
import java.util.Scanner;

public class ch8exercise1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = null;

        String fileName = "C:\\Temp\\phone.txt";
        
        try {
            fw = new FileWriter(fileName);

            System.out.println("전화번호 입력 프로그램입니다.");
            while(true) {
                System.out.print("이름 전화번호 >> ");
                String text = sc.nextLine();
                if(text.equals("그만")) {
                    break;
                }

                fw.write(text);
                fw.write("\r\n");
            }

            fw.close();
            System.out.println(fileName + "에 저장하였습니다.");
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

        sc.close();
    }
}
