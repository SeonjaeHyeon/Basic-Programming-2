// Exercise 2-6

import java.util.Scanner;

public class ch2exercise6 {
    public static void main(String[] args) {
        String result = "박수";
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int input = scanner.nextInt();

        int ten = input / 10;
        int one = input % 10;

        if(ten % 3 == 0 && input > 10) {
            result += "짝";
        }

        if(one % 3 == 0) {
            result += "짝";
        }

        if(result.length() > 2) {
            System.out.println(result);
        }

        scanner.close();
    }
}
