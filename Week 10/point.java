// 60201716 현선재

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		var data = new HashMap<String, Integer>();
		
		while(true) {
			System.out.println("**포인트 관리 프로그램입니다**");
			System.out.println("**1. 포인트 적립");
			System.out.println("**2: 포인트 조회");
			System.out.println("**3: 포인트 차감");
			System.out.println("**4: 최우수 고객 알림");
			System.out.println("**5: 종료");
			
			System.out.print("** 선택: ");
			int input = 0;
			try {
				input = scanner.nextInt();
			} catch(InputMismatchException e) {
				scanner.nextLine();
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				continue;
			}
			
			if(input == 1) {
				while(true) {
					System.out.print("이름과 구매금액 입력>> ");
					String name = scanner.next();
					if(name.equals("그만")) {
						break;
					}
					
					int point = 0;
					try {
						point = scanner.nextInt() / 10;
					} catch(InputMismatchException e) {
						scanner.nextLine();
						System.out.println("구매 금액 입력이 잘못되었습니다. 다시 입력하세요.");
						continue;
					}
					
					if(data.containsKey(name)) {
						data.put(name, data.get(name) + point);
					}
					else {
						data.put(name, point);
					}
					
					var keys = data.keySet();
					var it = keys.iterator();
					while(it.hasNext()) {
						String key = it.next();
						int value = data.get(key);
						System.out.print("(" + key + ", " + value + ") ");
					}
					System.out.println();
				}
			}
			else if(input == 2) {
				System.out.print("이름>> ");
				String name = scanner.next();
				Integer point = data.get(name);
				if(point == null) {
					System.out.println("등록되지 않은 고객입니다.");
					continue;
				}
				
				System.out.println("포인트: " + point);
			}
			else if(input == 3) {
				System.out.print("이름>> ");
				String name = scanner.next();
				Integer point = data.get(name);
				if(point == null) {
					System.out.println("등록되지 않은 고객입니다.");
					continue;
				}
				else if(point == 0) {
					System.out.println("포인트가 없어 차감할 수 없습니다.");
					continue;
				}
				
				System.out.print("상품가격>> ");
				int price = scanner.nextInt();
				if(point > price) {
					point = point - price;
					price = 0;
				}
				else {
					price = price - point;
					point = 0;
				}
				
				System.out.println("실지불액: " + price);
				System.out.println("잔여포인트: " + point);
				data.put(name, point);
			}
			else if(input == 4) {
				var keys = data.keySet();
				var it = keys.iterator();
				
				String maxName = "";
				int maxPoint = 0;
				while(it.hasNext()) {
					String name = it.next();
					int point = data.get(name);
					
					if(point > maxPoint) {
						maxName = name;
						maxPoint = point;
					}
				}
				
				System.out.println("최우수 고객>> " + maxName);
			}
			else if(input == 5) {
				System.out.println("MJ포인트 관리 프로그램 정상 종료");
				break;
			}
			else {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				continue;
			}
		}
		
		scanner.close();
	}

}
