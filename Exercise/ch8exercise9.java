// Exercise 8-9

import java.io.*;

public class ch8exercise9 {
    public static void main(String[] args) {
        try {
            String fileName = "C:\\Temp";

            System.out.println(fileName + " 디렉터리의 .txt 파일을 모두 삭제합니다....");
            File f = new File(fileName);

            File[] pathArray = f.listFiles();
            int count = 0;
            for(File e: pathArray) {
                if(e.isDirectory()) {
                    continue;
                }

                int index = e.getName().lastIndexOf(".txt");
                if(index != -1) {
                    System.out.println(e.getPath() + " 삭제");
                    e.delete();
                    count++;
                }
            }

            System.out.println("총 " + count + "개의 .txt 파일을 삭제하였습니다.");
        } catch(Exception e) {
            System.out.println("파일 오류");
        }
    }
}
