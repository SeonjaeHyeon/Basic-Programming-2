// Exercise 8-7

import java.io.*;

public class ch8exercise7 {
    public static void main(String[] args) {
        FileInputStream fi = null;
        FileOutputStream fo = null;
        
        try {
            System.out.println("a.jpg를 b.jpg로 복사합니다.");

            File orig = new File("a.jpg");

            long size = orig.length();

            fi = new FileInputStream(orig);
            fo = new FileOutputStream("b.jpg");

            int c;
            long index = 0;
            long last = 0;
            while((c = fi.read()) != -1) {
                fo.write((byte)c);
                index++;

                long percent = index * 100 / size;  // 순서 중요
                if(percent % 10 == 0 && percent != last) {
                    System.out.print("*");
                    last = percent;
                }
            }

            fi.close();
            fo.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
