// Exercise 7-1

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ch7exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();

        System.out.print("정수(-1이 입력될 때까지)>> ");
        while(true) {
            int input = sc.nextInt();
            if(input == -1) {
                break;
            }

            v.add(input);
        }

        System.out.println("가장 큰 수는 " + Collections.max(v));

        sc.close();
    }
}
