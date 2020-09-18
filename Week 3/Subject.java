// 60201716 현선재

import java.util.Scanner;
import java.util.InputMismatchException;

public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 과목명과 과목점수는 각각 최대 10개까지만 입력받습니다.
		String subjectName[] = new String[10];
		int subjectGrade[] = new int[10];
		
		String input;
		
		int subjectNum = 0;
		int gradeSum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요.");
		
		for (int i = 0; i < subjectName.length; i++) {
			try {
				System.out.print("과목명: ");
				input = scanner.next();
				if (input.equals("그만")) {
					break;
				}
				subjectName[i] = input;

				System.out.print("과목점수: ");
				subjectGrade[i] = scanner.nextInt();
				
			} catch (InputMismatchException e) {
				System.out.println("잘못된 과목 점수입니다. 다시 입력하세요.");
				scanner.nextLine();
				i--;
			}
		}

		for (int i = 0; i < subjectName.length; i++) {
			if (subjectName[i] == null) {
				break;
			}
			
			gradeSum += subjectGrade[i];
			subjectNum++;
		}
		
		try {
			// gradeSum을 double형으로 변환하면 결과값이 NaN이 나와 ArithmeticException 예외가 발생하지 않으므로 그대로 int형으로 계산하였습니다.
			System.out.println("입력된 과목들의 평균 성적: " + gradeSum / subjectNum);
			
		} catch (ArithmeticException e) {
			System.out.println("어떠한 과목도 입력되지 않았습니다.");
		}
		
		if (subjectNum != 0) {
			System.out.println("조회할 과목이름을 입력하세요.");
			
			while (true) {
				System.out.print("과목명: ");
				input = scanner.next();
				if (input.equals("그만")) {
					break;
				}
				
				try {
					for (int i = 0; ; i++) {
						if (subjectName[i].equals(input)) {
							System.out.println(subjectName[i] + "의 점수는 " + subjectGrade[i]);
							break;
						}
					}
				} catch (NullPointerException e) {
					System.out.println("해당 과목은 없음.");
				}	
			}
		}
		
		scanner.close();
	}
}
