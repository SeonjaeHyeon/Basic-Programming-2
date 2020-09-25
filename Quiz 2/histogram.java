// 60201716 현선재

import java.util.Scanner;

public class histogram {
	public static int digit(int n) {		
		return n / 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		int array[] = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 10개를 입력하세요");
		for(int i = 0; i < array.length; i++) {
			input = scanner.nextInt();
			
			if(input < 0 || input > 99) {
				continue;
			}
			
			array[digit(input)] += 1;
		}
		
		int ten_digit;
		for(int i = 0; i < array.length; i++) {
			ten_digit = i * 10;
			System.out.print((ten_digit + 0) + "~" + (ten_digit + 9) + ":");
			
			for(int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();  // 줄바꿈
		}
		
		scanner.close();
	}

}
