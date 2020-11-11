// Exercise 8-2

import java.io.*;
import java.util.Scanner;

public class ch8exercise2 {
    public static void main(String[] args) {
        FileReader fr = null;
        String fileName = "C:\\temp\\phone.txt";

        System.out.println("FileReader로 한 글자씩 읽는 방법");
        System.out.println(fileName + "을 출력합니다.");
        try {
            fr = new FileReader(fileName);

            int c;
            while((c = fr.read()) != -1) {
                System.out.print((char)c);
            }

            fr.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

        System.out.println();
        System.out.println("FileReader와 Scanner로 한 라인씩 읽는 방법");
        System.out.println(fileName + "을 출력합니다.");
        try {
            Scanner sc = new Scanner(new FileReader(fileName));
            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }

            sc.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

        System.out.println();
        System.out.println("FileReader와 BufferedReader로 한 라인씩 읽는 방법");
        System.out.println(fileName + "을 출력합니다.");
        try {
            BufferedReader bin = new BufferedReader(new FileReader(fileName));
            
            String l;
            while((l = bin.readLine()) != null) {
                System.out.println(l);
            }

            bin.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
