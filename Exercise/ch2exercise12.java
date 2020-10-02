// Exercise 2-12

import java.util.Scanner;

public class ch2exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float[] input = new float[2];
        String operator;

        System.out.print("연산>>");
        input[0] = scanner.nextFloat();
        operator = scanner.next();
        input[1] = scanner.nextFloat();

        System.out.println("if-else문 이용");
        if(operator.equals("+")) {
            System.out.println(input[0] + operator + input[1] + "의 계산 결과는 " + (input[0] + input[1]));
        }
        else if(operator.equals("-")) {
            System.out.println(input[0] + operator + input[1] + "의 계산 결과는 " + (input[0] - input[1]));
        }
        else if(operator.equals("*")) {
            System.out.println(input[0] + operator + input[1] + "의 계산 결과는 " + (input[0] * input[1]));
        }
        else if(operator.equals("/")) {
            if(input[1] == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            }
            else {
                System.out.println(input[0] + operator + input[1] + "의 계산 결과는 " + (input[0] / input[1]));
            }
        }

        System.out.println("switch문 이용");
        switch(operator) {
            case "+":
                System.out.println(input[0] + operator + input[1] + "의 계산 결과는 " + (input[0] + input[1]));
                break;
            case "-":
                System.out.println(input[0] + operator + input[1] + "의 계산 결과는 " + (input[0] - input[1]));
                break;
            case "*":
                System.out.println(input[0] + operator + input[1] + "의 계산 결과는 " + (input[0] * input[1]));
                break;
            case "/":
                if(input[1] == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                }

                System.out.println(input[0] + operator + input[1] + "의 계산 결과는 " + (input[0] / input[1]));
                break;
        }
        
        scanner.close();
    }
}
