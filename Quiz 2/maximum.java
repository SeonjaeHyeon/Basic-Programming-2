// 60201716 ������

import java.util.Scanner;

public class maximum {
	public static int[] dynamicIntArray(int[] array, int last) {
		int[] result = new int[array.length + 1];
		
		for(int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}
		result[array.length] = last;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		int[] numbers = new int[2];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���. (0 �Է½� ����)");
		for(int i = 0; ; i++) {
			input = scanner.nextInt();
			if(input == 0) {
				break;
			}
			
			try {
				numbers[i] = input;
			} catch(ArrayIndexOutOfBoundsException e) {
				numbers = dynamicIntArray(numbers, input);
			}
		}
		
		int temp1;
		int temp2;
		for(int i = 0; i < numbers.length - 1; i++) {
			for(int j = 0; j < numbers.length - 1 - i; j++) {
				if(numbers[j] > numbers[j + 1]) {
					temp1 = numbers[j];
					temp2 = numbers[j + 1];
					numbers[j] = temp2;
					numbers[j + 1] = temp1;
				}
			}
		}
		
		System.out.println("���� ū ��: " + numbers[numbers.length - 1]);
		System.out.println("�ι�° ū ��: " + numbers[numbers.length - 2]);
		
		scanner.close();
	}

}
