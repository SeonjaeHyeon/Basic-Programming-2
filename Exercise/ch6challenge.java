// Open Challenge 6

import java.util.Scanner;

public class ch6challenge {
    static String readString() {
        StringBuffer sb = new StringBuffer();  // 키 입력을 받을 스트링버퍼 생성
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();  // 텍스트 한 라인을 읽는다.
            if(line.equals(";"))  // ';'만 있는 라인이면
                break;  // 입력 끝
            sb.append(line);  // 읽은 라인 문자열을 스트링버퍼에 추가한다.
        }
        return sb.toString();  // 스트링버퍼의 문자열을 스트링으로 리턴
    }
    
    public static void main(String[] args) {
        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        StringBuffer result = new StringBuffer(readString().toUpperCase());

        System.out.println("히스토그램을 그립니다.");
        String [] alphabet = new String[26];
        String [] graph = new String[26];

        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)('A' + i) + "";
        }

        for(int i = 0; i < graph.length; i++) {
            graph[i] = "";
        }

        for(int i = 0; i < result.length(); i++) {
            int index = result.charAt(i) - 'A';
            if(index < 0 || index > 26) {
                continue;
            }

            graph[index] += "-";
        }

        for(int i = 0; i < alphabet.length; i++) {
            System.out.println(alphabet[i] + graph[i]);
        }
    }
}
