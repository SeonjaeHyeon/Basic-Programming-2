// 60201716 현선재

import java.util.Scanner;


public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input;
		
		System.out.print("정수를 입력하시오>> ");
		
		input = scanner.nextInt();
		
		for(int i = input; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print('*');
			}
			if(i != 1) {
				System.out.println();
			}
		}
		
		scanner.close();
	}

}
