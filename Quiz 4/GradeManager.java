// 60201716	현선재

import java.util.*;
import java.io.*;

public class GradeManager {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("**Java 성적 파일 이름을 입력하세요: ");
            String fileName = sc.nextLine();
            File f = new File(fileName);

            var data = new HashMap<String, Integer>();
            Scanner fScanner = new Scanner(new FileReader(f));
            while(fScanner.hasNext()) {
                String line = fScanner.nextLine();
                String[] lines = line.split(" ");
                if(lines.length != 2) {
                    continue;
                }
                data.put(lines[0], Integer.parseInt(lines[1]));
            }
            fScanner.close();
            System.out.println("**총 " + data.size() + "명 학생의 Java 성적을 읽었습니다.");

            var al = new ArrayList<>(data.values());
            Collections.sort(al);
            Collections.reverse(al);

            String[] keyArray = new String[al.size()];
            var keys = data.keySet();
            for(int i = 0; i < al.size(); i++) {
                int num = al.get(i);

                var it = keys.iterator();
                while(it.hasNext()) {
                    String key = it.next();
                    if(data.get(key) == num) {
                        keyArray[i] = key;
                    }
                }
            }

            for(int i = 0; i < keyArray.length; i++) {
                String key = keyArray[i];
                System.out.println(key + " " + data.get(key));
            }

            var data2 = new HashMap<String, String>();
            for(int i = 0; i < keyArray.length; i++) {
                String key = keyArray[i];
                String value = key + " " + data.get(key) + "점 " + (i + 1) + "등";

                data2.put(key, value);
            }

            while(true) {
                System.out.print("**학생의 이름을 입력하세요: ");
                String name = sc.nextLine();
                if(name.equals("그만")) {
                    break;
                }

                String text = data2.get(name);
                if(text == null) {
                    System.out.println("등록되지 않은 학생입니다.");
                    continue;
                }

                System.out.println(text);
            }
            
            FileWriter fw = new FileWriter(new File("java2.txt"));
            for(int i = 0; i < keyArray.length; i++) {
                String key = keyArray[i];
                fw.write(key + ", " + data.get(key) + "점, " + (i + 1) + "등");
                fw.write("\r\n");
            }
            fw.close();

            System.out.println("java2.txt 파일로 저장되었습니다.");

            sc.close();
        } catch(java.io.IOException e) {
            System.out.println("파일 입출력 오류");
        }

    }

}
