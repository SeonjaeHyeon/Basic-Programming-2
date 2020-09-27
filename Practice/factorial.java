import java.util.Scanner;

public class factorial {
	public static int factorial_recursion(int n) {
		if(n <= 1) {
			return 1;
		}
		else {
			return factorial_recursion(n - 1) * n;
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 입력>> ");
		
		int input = scanner.nextInt();
		System.out.println(factorial_recursion(input));
		
		scanner.close();
	}

}
