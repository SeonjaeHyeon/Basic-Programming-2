// Exercise 7-4

import java.util.*;

public class ch7exercise4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("for문, size() 메소드 이용");
        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int input = sc.nextInt();
            if(input == 0) {
                break;
            }
            v.add(input);

            int sum = 0;
            for(int i = 0; i < v.size(); i++) {
                int n = v.get(i);
                sum += n;
                System.out.print(n + " ");
            }
            System.out.println();

            System.out.println("현재 평균 " + sum / v.size());
        }

        System.out.println();

        Vector<Integer> v2 = new Vector<Integer>();
        System.out.println("while문, iterator 이용");
        while(true) {
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int input = sc.nextInt();
            if(input == 0) {
                break;
            }
            v2.add(input);

            int sum = 0;
            Iterator<Integer> it = v2.iterator();
            while(it.hasNext()) {
                int n = it.next();
                sum += n;
                System.out.print(n + " ");
            }
            System.out.println();

            System.out.println("현재 평균 " + sum / v2.size());
        }
        
        sc.close();
    }
}
