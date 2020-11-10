// 60201716 현선재
// 제출 마감 후 오류 수정

import java.util.*;

public class Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var data = new HashMap<String, Integer>();

        System.out.println("**Java 성적 관리 프로그램입니다**");
        while(true) {
            System.out.print("이름과 성적 입력>> ");

            String name = sc.next();
            if(name.equals("끝")) {
                break;
            }
            int score = sc.nextInt();

            data.put(name, score);
        }

        var keys = data.keySet();
        var it = keys.iterator();
        var al = new LinkedList<Integer>();
        while(it.hasNext()) {
            String n = it.next();
            al.add(data.get(n));
        }
        Collections.sort(al);
        Collections.reverse(al);

        String [] keyArray = new String[al.size()];
        var it2 = al.iterator();
        int index = 0;
        while(it2.hasNext()) {
            int num = it2.next();

            var it3 = keys.iterator();
            while(it3.hasNext()) {
                String n2 = it3.next();
                if(data.get(n2) == num) {
                    keyArray[index] = n2;
                    break;
                }
            }

            index++;
        }

        System.out.println("Java 성적 입니다.");

        for(int i = 0; i < keyArray.length; i++) {
            System.out.print(keyArray[i]);
            double p = (double)(i + 1) / keyArray.length * 100;
            if(p <= 20) {
                System.out.print(" A ");
            }
            else if(p > 20 && p <= 50) {
                System.out.print(" B ");
            }
            else if(p > 50 && p <= 70) {
                System.out.print(" C ");
            }
            else if(p > 70 && p <= 90) {
                System.out.print(" D ");
            }
            else {
                System.out.print(" F ");
            }

            System.out.println("(" + (int)p + "%)");
        }

        sc.close();
    }

}
