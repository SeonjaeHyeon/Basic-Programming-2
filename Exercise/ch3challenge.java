// Open Challenge 3

import java.util.Random;
import java.util.Scanner;

public class ch3challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int k;
        int i;
        int input;
        int min;
        int max;

        while(true) {
            k = r.nextInt(100);
            min = 0;
            max = 99;

            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println(min + "-" + max);

            i = 1;
            while(true) {
                System.out.print(i + ">>");
                input = scanner.nextInt();

                if(input == k) {
                    break;
                }
                else if(input > k) {
                    System.out.println("더 낮게");
                    max = input;
                }
                else {
                    System.out.println("더 높게");
                    min = input;
                }
                System.out.println(min + "-" + max);
                i++;
            }

            System.out.println("맞았습니다.");
            System.out.print("다시하시겠습니까(y/n)>>");
            if(scanner.next().equals("n")) {
                break;
            }
        }

        scanner.close();
    }
}
