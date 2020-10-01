// Exercise 2-7

import java.util.Scanner;

public class ch2exercise7 {
    public static void main(String[] args) {
        int[] a = {100, 100};
        int[] b = {200, 200};

        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x, y)의 좌표를 입력하시오>>");
        int[] c = new int[2];

        for(int i = 0; i < c.length; i++) {
            c[i] = scanner.nextInt();
        }
        
        if(c[0] > a[0] && c[0] < b[0] && c[1] > a[1] && c[1] < b[1]) {
            System.out.println(c[0] + ", " + c[1] + "는 사각형 안에 있습니다.");
        }
        else {
            System.out.println(c[0] + ", " + c[1] + "는 사각형 안에 없습니다.");
        }

        scanner.close();
    }
}
