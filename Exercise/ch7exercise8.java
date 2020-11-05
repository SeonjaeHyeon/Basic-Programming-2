// Exercise 7-8

import java.util.HashMap;
import java.util.Scanner;

public class ch7exercise8 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var data = new HashMap<String, Integer>();

        System.out.println("** 포인트 관리 프로그램입니다 **");
        while(true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = sc.next();
            if(name.equals("그만")) {
                break;
            }
            int point = sc.nextInt();

            if(data.containsKey(name)) {
                data.put(name, data.get(name) + point);
            }
            else {
                data.put(name, point);
            }

            var keys = data.keySet();
            var it = keys.iterator();
            while(it.hasNext()) {
                String key = it.next();
                int value = data.get(key);

                System.out.print("(" + key + ", " + value + ") ");
            }
            System.out.println();
        }

        sc.close();
    }
}
