// Exercise 4-8

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String n, String t) {
        this.name = n;
        this.tel = t;
    }

    public String search(String n) {
        if(n.equals(this.name)) {
            return this.tel;
        }
        else {
            return null;
        }
    }
}

public class ch4exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Phone [] p;
        
        System.out.print("인원수>>");
        int people = scanner.nextInt();
        p = new Phone[people];

        for(int i = 0; i < people; i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String input1 = scanner.next();
            String input2 = scanner.next();

            p[i] = new Phone(input1, input2);
        }
        System.out.println("저장되었습니다...");

        while(true) {
            System.out.print("검색할 이름>>");
            String input3 = scanner.next();

            String result = null;
            for(int i = 0; i < p.length; i++) {
                result = p[i].search(input3);
                if(result != null) {
                    break;
                }
            }

            if (input3.equals("그만")) {
                break;
            }

            if(result == null) {
                System.out.println(input3 + " 이/가 없습니다.");
            }
            else {
                System.out.println(input3 + "의 번호는 " + result + " 입니다.");
            }
        }

        scanner.close();
    }
}
