// 60201716 현선재

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int width;
		int width2;
		int height;
		double radius;
		final double PI = 3.14;
		
		System.out.println("도형의 종류, 넓이 구하는데 필요한 값들을 빈칸으로 분리하여 입력하세요.");
		System.out.println("ex) 삼각형 밑변 높이");
		System.out.println("    원 반지름");
		System.out.println("    사각형 밑변 높이");
		System.out.println("    마름모 대각선1 대각선2");
		System.out.println("    사다리꼴 윗변 아랫변 높이");
		System.out.print("입력: ");
		
		Scanner scanner = new Scanner(System.in);

		String type = scanner.next();
		
		switch (type) {
		case "삼각형":
			width = scanner.nextInt();
			height = scanner.nextInt();
			
			System.out.println("삼각형의 넓이 = " + width * height / 2);
			break;
		case "원":
			radius = scanner.nextDouble();
			
			System.out.println("원의 넓이 = " + radius * radius * PI);
			break;
		case "사각형":
			width = scanner.nextInt();
			height = scanner.nextInt();
			
			System.out.println("사각형의 넓이 = " + width * height);
			break;
		case "마름모":
			width = scanner.nextInt();
			height = scanner.nextInt();
			
			System.out.println("마름모의 넓이 = " + width * height / 2);
			break;
		case "사다리꼴":
			width = scanner.nextInt();
			width2 = scanner.nextInt();
			height = scanner.nextInt();
			
			System.out.println("사다리꼴의 넓이 = " + (width + width2) * height / 2);
			break;
		}
		
		scanner.close();
	}

}
