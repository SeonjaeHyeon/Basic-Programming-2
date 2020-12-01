// 60201716 현선재

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		var m = new HashMap<String, Double>();
		
		System.out.println("명지 장학금 관리 시스템입니다. 이름과 학점을 입력하세요.");
		while(true) {
			System.out.print("이름과 학점>> ");
			String line = sc.nextLine();
			if(line.equals("그만")) {
				break;
			}
			
			String[] lines = line.split(" ");
			if(lines.length < 2) {
				System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
			}
			
			m.put(lines[0], Double.valueOf(lines[1]));
		}
		
		System.out.print("장학생 선발 학점 기준을 입력하세요>> ");
		double num = sc.nextDouble();
		String names = "";
		var keys = m.keySet();
		var it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(m.get(key) >= num) {
				names += key + " ";
			}
		}
		
		System.out.println("장학생 명단: " + names.trim());
		sc.close();
	}

}
