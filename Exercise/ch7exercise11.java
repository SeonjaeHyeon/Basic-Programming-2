// Exercise 7-11

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class Nation {
    private String country;
    private String capital;

    public Nation(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCapital() {
        return this.capital;
    }
}

public class ch7exercise11 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var rand = new Random();

        String [] coun = {"독일", "멕시코", "영국", "중국", "러시아", "스페인", "프랑스", "그리스", "일본"};
        String [] capi = {"베를린", "멕시코시티", "런던", "베이징", "모스크바", "마드리드", "파리", "아테네", "도쿄"};

        System.out.println("Vector 이용");

        var data = new Vector<Nation>();
        for(int i = 0; i < coun.length; i++) {
            data.add(new Nation(coun[i], capi[i]));
        }

        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while(true) {
            System.out.print("입력: 1, 퀴즈: 2, 종료: 3 >>");
            int input = scanner.nextInt();
            if(input == 1) {
                System.out.println("현재 " + data.size() + "개 나라와 수도가 입력되어 있습니다.");
                while(true) {
                    System.out.print("나라와 수도 입력" + (data.size() + 1) + " >>");
                    String country = scanner.next();
                    if(country.equals("그만")) {
                        break;
                    }
                    String capital = scanner.next();

                    boolean isDupl = false;
                    for(Nation n: data) {
                        if(n.getCountry().equals(country)) {
                            isDupl = true;
                            System.out.println(country + "은/는 이미 있습니다!");
                            break;
                        }
                    }
                    if(isDupl) {
                        continue;
                    }

                    data.add(new Nation(country, capital));
                }
            }
            else if(input == 2) {
                while(true) {
                    int index = rand.nextInt(data.size());
                    var n = data.get(index);

                    System.out.print(n.getCountry() + "의 수도는? ");
                    String ans = scanner.next();
                    if(ans.equals("그만")) {
                        break;
                    }
                    else if(ans.equals(n.getCapital())) {
                        System.out.println("정답 !!");
                    }
                    else {
                        System.out.println("아닙니다 !!");
                    }
                }
            }
            else if(input == 3) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
            }
        }

        System.out.println("HashMap 이용");

        var data2 = new HashMap<String, String>();
        for(int i = 0; i < coun.length; i++) {
            data2.put(coun[i], capi[i]);
        }

        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while(true) {
            System.out.print("입력: 1, 퀴즈: 2, 종료: 3 >>");
            int input = scanner.nextInt();
            if(input == 1) {
                System.out.println("현재 " + data2.size() + "개 나라의 수도가 입력되어 있습니다.");
                while(true) {
                    System.out.print("나라와 수도 입력" + (data2.size() + 1) + " >>");
                    String country = scanner.next();
                    if(country.equals("그만")) {
                        break;
                    }
                    String capital = scanner.next();

                    if(data2.containsKey(country)) {
                        System.out.println(country + "은/는 이미 있습니다!");
                        continue;
                    }

                    data2.put(country, capital);
                }
            }
            else if(input == 2) {
                while(true) {
                    int index = rand.nextInt(data.size());
                    var keys = data2.keySet();
                    String [] array = keys.toArray(new String[0]);

                    System.out.print(array[index] + "의 수도는? ");
                    String ans = scanner.next();
                    if(ans.equals("그만")) {
                        break;
                    }
                    else if(ans.equals(data2.get(array[index]))) {
                        System.out.println("정답 !!");
                    }
                    else {
                        System.out.println("아닙니다 !!");
                    }
                }
            }
            else if(input == 3) {
                System.out.println("게임을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
            }
        }
        
        scanner.close();
    }
}
