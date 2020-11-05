// Exercise 7-6

import java.util.HashMap;
import java.util.Scanner;

class Location {
    private String name;
    private int pos1;
    private int pos2;

    public Location(String name, int pos1, int pos2) {
        this.name = name;
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public String getName() {
        return this.name;
    }
    
    public int getPos1() {
        return this.pos1;
    }

    public int getPos2() {
        return this.pos2;
    }
}

public class ch7exercise6 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var data = new HashMap<String, Location>();

        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String [] s = sc.nextLine().split(", ");
            String name = s[0];
            int pos1 = Integer.parseInt(s[1]);
            int pos2 = Integer.parseInt(s[2]);

            data.put(name, new Location(name, pos1, pos2));
        }

        System.out.println("-------------------");
        var keys = data.keySet();
        var it = keys.iterator();
        while(it.hasNext()) {
            String key = it.next();
            Location value = data.get(key);

            System.out.println(value.getName() + "\t" + value.getPos1() + "\t" + value.getPos2());
        }
        System.out.println("-------------------");

        while(true) {
            System.out.print("도시 이름 >> ");
            String input = sc.next();
            if(input.equals("그만")) {
                break;
            }

            Location value = data.get(input);
            if(value == null) {
                System.out.println(input + "은/는 없습니다.");
                continue;
            }

            System.out.println(value.getName() + "\t" + value.getPos1() + "\t" + value.getPos2());
        }

        sc.close();
    }
}
