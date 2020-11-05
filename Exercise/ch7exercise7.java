// Exercise 7-7

import java.util.HashMap;
import java.util.Scanner;

public class ch7exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var data = new HashMap<String, Double>();

        System.out.println("미래장학금관리시스템입니다.");
        for(int i = 0; i < 5; i++) {
            System.out.print("이름과 학점>> ");
            String name = sc.next();
            double grade = sc.nextDouble();

            data.put(name, grade);
        }

        System.out.print("장학생 선발 학점 기준 입력>> ");
        double least = sc.nextDouble();
        System.out.print("장학생 명단 :");

        var keys = data.keySet();
        var it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            double value = data.get(key);

            if(value > least) {
                System.out.print(" " + key);
            }
        }

        sc.close();
    }
}
