// 60201716 현선재

import java.util.Scanner;

public class proverb {
	public static void strSort(String [] s) {
		for(int i = 0; i < s.length - 1; i++) {
			for(int j = 0; j < s.length - 1 - i; j++) {
				if(s[j].compareTo(s[j + 1]) > 0) {
					String temp1 = s[j + 1];
					String temp2 = s[j];
					
					s[j] = temp1;
					s[j + 1] = temp2;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("속담을 입력하시오:");
		String input = scanner.nextLine();
		String [] strArray = input.split(" ");
		
		int n = strArray.length;
		strSort(strArray);
		
		System.out.println("단어 개수: " + n);
		System.out.println("정렬된 토큰:");
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				System.out.print(strArray[i]);
				continue;
			}
			
			System.out.print(", " + strArray[i]);
		}
		
		scanner.close();
	}

}
