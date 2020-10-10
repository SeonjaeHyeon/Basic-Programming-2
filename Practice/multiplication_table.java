import java.util.Scanner;

public class multiplication_table {
    static int[] func(int[] n) {
        if(n[1] > 9) {
            return n;
        }
        else {
            System.out.println(n[0] + " * " + n[1] + " = " + n[0] * n[1]);
            n[1]++;
            return func(n);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하시오 >>");
        int input = scanner.nextInt();

        int [] n = {input, 1};
        func(n);

        scanner.close();
    }
}