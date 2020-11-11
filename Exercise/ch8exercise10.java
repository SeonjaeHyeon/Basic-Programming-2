// Exercise 8-10

import java.io.*;
import java.util.*;

public class ch8exercise10 {
    public static void main(String[] args) {
        String filePath = "C:\\Temp\\phone.txt";

        var data = new HashMap<String, String>();

        try {
            Scanner fScanner = new Scanner(new FileReader(filePath));
            while(fScanner.hasNext()) {
                String[] line = fScanner.nextLine().split(" ");

                data.put(line[0], line[1]);
            }

            fScanner.close();
        } catch(IOException e) {
            System.out.println("입출력 오류");
        } catch(Exception e) {
            System.out.println("알 수 없는 오류");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("총 " + data.size() + "개의 전화번호를 읽었습니다.");
        while(true) {
            System.out.print("이름>> ");
            String name = sc.nextLine();
            if(name.equals("그만")) {
                break;
            }

            if(!data.containsKey(name)) {
                System.out.println("찾는 이름이 없습니다.");
                continue;
            }

            System.out.println(data.get(name));
        }

        sc.close();
    }   
}
