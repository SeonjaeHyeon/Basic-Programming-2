// Exercise 7-13

import java.util.*;

public class ch7exercise13 {
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("슈퍼컴이 작동합니다. 프로그램을 입력해주세요. GO를 입력하면 작동합니다.");
        while(true) {
            var al = new ArrayList<String>();
            var data = new HashMap<String, Integer>();
    
            while(true) {
                System.out.print(">> ");
                String input = sc.nextLine();
                if(input.equals("exit")) {
                    sc.close();
                    System.exit(0);
                }
                else if(input.equals("go")) {
                    break;
                }
    
                al.add(input);
            }
    
            for(int i = 0; i < al.size(); i++) {
                String[] params = al.get(i).split(" ");
                if(params[0].equals("mov")) {
                    if(isInteger(params[2])) {
                        data.put(params[1], Integer.parseInt(params[2]));
                    }
                    else {
                        data.put(params[1], data.get(params[2]));
                    }
                }
                else if(params[0].equals("add")) {
                    if(isInteger(params[2])) {
                        data.put(params[1], data.getOrDefault(params[1], 0) + Integer.parseInt(params[2]));
                    }
                    else {
                        data.put(params[1], data.getOrDefault(params[1], 0) + data.get(params[2]));
                    }
                }
                else if(params[0].equals("sub")) {
                    if(isInteger(params[2])) {
                        data.put(params[1], data.getOrDefault(params[1], 0) - Integer.parseInt(params[2]));
                    }
                    else {
                        data.put(params[1], data.getOrDefault(params[1], 0) - data.get(params[2]));
                    }
                }
                else if(params[0].equals("jn0")) {
                    if(data.get(params[1]) != 0) {
                        i = Integer.parseInt(params[2]) - 1;  // for문의 i++ 때문에 1 증가하므로 1을 미리 빼주어야 한다.
                    }
                }
                else if(params[0].equals("prt")) {
                    System.out.println("[" + al.get(i) + "]");
    
                    for(Map.Entry<String, Integer> e: data.entrySet()) {
                        System.out.print(e.getKey().toUpperCase() + ":" + e.getValue() + " ");
                    }
                    System.out.println();
                    System.out.println("출력할 결과는 " + data.get(params[1]) + ". 프로그램 실행 끝");
                }
            }
        }
    }
}
