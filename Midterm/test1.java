import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.print("양의 정수를 입력하세요: ");
			int input = scanner.nextInt();
			
			if(input < 0) {
				break;
			}
			else if(input % 2 == 0) {
				sum += input;
			}
		}
		
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
		
		scanner.close();
	}

}
