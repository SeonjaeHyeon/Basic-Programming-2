// Exercise 7-2

import java.util.ArrayList;
import java.util.Scanner;

public class ch7exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var al = new ArrayList<Character>();

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i = 0; i < 6; i++) {
            String input = sc.next();
            al.add(input.charAt(0));
        }

        double avg = 0.0;
        for(Character grade : al) {
            switch(grade) {
                case 'A':
                    avg += 4.0;
                    break;
                case 'B':
                    avg += 3.0;
                    break;
                case 'C':
                    avg += 2.0;
                    break;
                case 'D':
                    avg += 1.0;
                    break;
            }
        }

        System.out.println(avg / al.size());

        sc.close();
    }
}
