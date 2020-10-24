// Exercise 6-10

import java.util.Scanner;

class Person {
    private String name;
    private int [] num;

    public Person(String name) {
        this.name = name;
    }

    private void get_number() {
        if(num == null) {
            num = new int[3];
        }

        for(int i = 0; i < num.length; i++) {
            num[i] = (int)((Math.random() * 10) / 3 + 1);
            System.out.print(num[i] + "\t");
        }
    }

    public String get_name() {
        return this.name;
    }

    public boolean play() {
        System.out.print("\t");
        get_number();

        if(num[0] != num[1] || num[1] != num[2] || num[2] != num[0]) {
            return false;
        }

        return true;
    }
}

public class ch6exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person [] player = new Person[2];

        for(int i = 0; i < 2; i++) {
            System.out.print((i + 1) + "번째 선수 이름>>");
            player[i] = new Person(scanner.nextLine());
        }

        boolean hasWinner = false;
        while(!hasWinner) {
            for(int i = 0; i < player.length; i++) {
                System.out.print("[" + player[i].get_name() + "]:<Enter>");
                scanner.nextLine();
                hasWinner = player[i].play();

                if(hasWinner) {
                    System.out.println(player[i].get_name() + "님이 이겼습니다!");
                    break;
                }
                else {
                    System.out.println("아쉽군요!");
                }                
            }
        }

        scanner.close();
    }
}
