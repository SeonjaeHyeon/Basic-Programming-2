// Exercise 4-12

import java.util.Scanner;

class Seat {
    private String type;
    private String [] index = new String[10];

    public Seat(String t) {
        this.type = t;

        for(int i = 0; i < this.index.length; i++) {
            this.index[i] = "---";
        }
    }

    public void show() {
        System.out.print(this.type + ">>");

        for(String k: this.index) {
            System.out.print(" " + k);
        }
        System.out.println();
    }

    public void reserve(String n, int i) {
        this.index[i - 1] = n;
    }

    public void cancel(String n) {
        for(int i = 0; i < this.index.length; i++) {
            if(this.index[i].equals(n)) {
                this.index[i] = "---";
            }
        }
    }
}

public class ch4exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Seat [] seat;
        seat = new Seat[3];

        String [] seat_type = {"S", "A", "B"};

        for(int i = 0; i < seat.length; i++) {
            seat[i] = new Seat(seat_type[i]);
        }

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        int input;
        while(true) {
            System.out.print("예약: 1, 조회: 2, 취소: 3, 끝내기: 4>>");
            input = scanner.nextInt();
            
            if(input == 4) {
                break;
            }
            else if(input == 1) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                input = scanner.nextInt();

                seat[input - 1].show();

                System.out.print("이름>>");
                String name = scanner.next();

                System.out.print("번호>>");
                int number = scanner.nextInt();

                seat[input - 1].reserve(name, number);
            }
            else if(input == 2) {
                for(int i = 0; i < seat.length; i++) {
                    seat[i].show();
                }

                System.out.println("<<조회를 완료하였습니다.>>");
            }
            else if(input == 3) {
                System.out.print("좌석구분 S(1), A(2), B(3)>>");
                input = scanner.nextInt();

                seat[input - 1].show();

                System.out.print("이름>>");
                String name = scanner.next();

                seat[input - 1].cancel(name);
            }
        }

        scanner.close();
    }
}
