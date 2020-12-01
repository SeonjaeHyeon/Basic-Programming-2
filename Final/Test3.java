// 60201716 현선재

import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 문장을 입력하시오:");
		String str = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(str);
		int word_num = st.countTokens();
		var data = new HashMap<String, Integer>();
		while(st.hasMoreTokens()) {
			String key = st.nextToken();
			data.put(key, data.getOrDefault(key, 0) + 1);
		}
		
		var keys = data.keySet();
		var al = new ArrayList<String>(keys);
		Collections.sort(al);
		
		String sorted = "";
		for(int i = 0; i < al.size(); i++) {
			if(i == al.size() - 1) {
				sorted += al.get(i);
			}
			else {
				sorted += al.get(i) + ", ";
			}
		}
		
		String over_twice = "";
		var it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			if(data.get(key) >= 2) {
				over_twice += key + " ";
			}
		}
		
		var data2 = new HashMap<Character, Integer>();
		char[] chr = str.toCharArray();
		for(int i = 0; i < chr.length; i++) {
			data2.put(chr[i], data2.getOrDefault(chr[i], 0) + 1);
		}
		
		int max = 0;
		char max_chr = ' '; 
		var keys2 = data2.keySet();
		var it2 = keys2.iterator();
		while(it2.hasNext()) {
			char key2 = it2.next();
			if(key2 == ' ') {
				continue;
			}
			if(data2.get(key2) > max) {
				max_chr = key2;
				max = data2.get(key2);
			}
		}
		
		System.out.println("<분석 결과 입니다>");
		System.out.println("단어 개수: " + word_num);
		System.out.println("단어 정렬: ");
		System.out.println(sorted);
		System.out.println("두번 이상 등장한 단어:");
		System.out.println(over_twice.trim());
		System.out.println("가장 많이 등장한 알파벳:");
		System.out.println(max_chr);
		
		sc.close();
	}

}
