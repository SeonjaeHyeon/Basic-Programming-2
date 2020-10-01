// Exercise 2-8

import java.util.Scanner;

public class ch2exercise8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] a = {100, 100};
        int[] b = {200, 200};
        int[] c = new int[2];
        int[] d = new int[2];

        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x1, y1)의 좌표를 입력하시오>>");
        for(int i = 0; i < c.length; i++) {
            c[i] = scanner.nextInt();
        }

        System.out.print("점 (x2, y2)의 좌표를 입력하시오>>");
        for(int i = 0; i < d.length; i++) {
            d[i] = scanner.nextInt();
        }

        if(inRect(a[0], a[1], c[0], c[1], d[0], d[1]) || inRect(b[0], b[1], c[0], c[1], d[0], d[1])) {
            System.out.println("두 직사각형이 충돌합니다.");
        }
        else {
            System.out.println("두 직사각형이 충돌하지 않습니다.");
        }

        scanner.close();
    }
}
