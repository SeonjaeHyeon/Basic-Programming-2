// Exercise 8-8

import java.io.*;

public class ch8exercise8 {
    public static void main(String[] args) {
        try {
            File f = new File("C:/");
            File[] pathArray = f.listFiles();

            File max = pathArray[0];
            for(File e: pathArray) {
                if(e.length() > max.length()) {
                    max = e;
                }
            }

            System.out.println("가장 큰 파일은 " + max.getPath() + " " + max.length() + "바이트");
        } catch(Exception e) {
            System.out.println("파일 오류");
        }
    } 
}
