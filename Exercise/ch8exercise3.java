// Exercise 8-3

import java.io.*;

public class ch8exercise3 {
    public static void main(String[] args) {
        FileReader fr = null;

        String fileName = "C:/Windows/system.ini";

        System.out.println("한 글자씩 읽어 변환하는 방법");
        try {
            fr = new FileReader(fileName);

            int c;
            while((c = fr.read()) != -1) {
                System.out.print(Character.toUpperCase((char)c));
            }

            fr.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }

        System.out.println();
        System.out.println("한 라인씩 읽어 변환하는 방법");
        try {
            BufferedReader bin = new BufferedReader(new FileReader(fileName));

            String l;
            while((l = bin.readLine()) != null) {
                System.out.println(l.toUpperCase());
            }

            bin.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
