import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int [][] array = new int[3][3];
		
		System.out.println("3 x 3의 행렬의 각 숫자를 차례대로 입력하세요.");
		System.out.println("2 7 6");
		System.out.println("9 5 1");
		System.out.println("4 3 8");
		System.out.println("인 경우 2 7 6 9 5 1 4 3 8 입력");
		System.out.print("입력 >>");
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				int input = scanner.nextInt();
				array[i][j] = input;
			}
		}
		
		int last = -1;
		int current = 0;
		boolean isNot = false;
		// 가로 확인
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				current += array[i][j];
			}
			
			if(last < 0) {
				last = current;
			}
			else if(last != current) {
				isNot = true;
			}
			
			current = 0;
		}
		
		// 세로 확인
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				current += array[j][i];
			}
			
			if(last < 0) {
				last = current;
			}
			else if(last != current) {
				isNot = true;
			}
			
			current = 0;
		}
		
		// 대각선 확인
		for(int i = 0; i < array.length; i++) {
			current += array[i][i];
		}
		
		if(last < 0) {
			last = current;
		}
		else if(last != current) {
			isNot = true;
		}
		
		current = 0;
		
		for(int i = array.length - 1; i >= 0; i--) {
			current += array[i][i];
		}
		
		if(last < 0) {
			last = current;
		}
		else if(last != current) {
			isNot = true;
		}
		
		// 마방진인지 확인
		if(isNot) {
			System.out.println("마방진이 아닙니다!");
		}
		else {
			System.out.println("마방진입니다.");
		}
		
		scanner.close();
	}

}
