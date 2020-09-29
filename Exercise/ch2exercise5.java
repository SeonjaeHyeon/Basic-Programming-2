// Exercise 2-5

import java.util.Scanner;

public class ch2exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];

        System.out.print("정수 3개를 입력하시오>>");
        for(int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        // 버블 정렬
        int temp1;
        int temp2;
        for(int i = 0; i < input.length - 1; i++) {
            for(int j = 0; j < input.length - 1 - i; j++) {
                if(input[j] > input[j + 1]){
                    temp1 = input[j];
                    temp2 = input[j + 1];
                    input[j] = temp2;
                    input[j + 1] = temp1;
                }
            }
        }

        if(input[0] + input[1] > input[2]) {
            System.out.println("삼각형이 됩니다");
        }
        else {
            System.out.println("삼각형이 되지 않습니다");
        }

        scanner.close();
    }
}
