// Exercise 2-4
/*
ex)
20 33 100

33 20 100
100 20 33

20 100 33
33 100 20

100 33 20
*/

import java.util.Scanner;

public class ch2exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[3];
        int result;

        System.out.print("정수 3개 입력>>");
        for(int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.print("중간 값은 ");
        if(input[0] < input[1] && input[1] < input[2]) {
            result = input[1];
        }
        else if(input[0] > input[1] && input[1] < input[2]) {
            if(input[0] < input[2]) {
                result = input[0];
            }
            else {
                result = input[2];
            }
        }
        else if(input[0] < input[1] && input[1] > input[2]) {
            if(input[0] < input[2]) {
                result = input[2];
            }
            else {
                result = input[0];
            }
        }
        else {
            result = input[1];
        }

        System.out.print(result);

        scanner.close();
    }
}
