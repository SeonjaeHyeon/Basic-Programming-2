// Exercise 8-4

import java.io.*;
import java.util.Scanner;

public class ch8exercise4 {
    public static void main(String[] args) {
        String fileName = "C:\\Windows\\system.ini";

        System.out.println(fileName + " 파일을 읽어 출력합니다.");
        
        try {
            Scanner sc = new Scanner(new FileReader(fileName));
            int index = 1;
            while(sc.hasNext()) {
                System.out.printf("%4d", index);
                System.out.println(": " + sc.nextLine());
                index++;
            }

            sc.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
