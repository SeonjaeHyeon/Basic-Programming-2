// Exericse 4-7

import java.util.Scanner;

class Day {
    private String work;
    
    public void set(String work) {
        this.work = work;
    }

    public String get() {
        return work;
    }

    public void show() {
        if(work == null) {
            System.out.println("없습니다.");
        }
        else {
            System.out.println(work + "입니다.");
        }
    }
}

class MonthSchedule {
    private int endDay;
    private Scanner scanner = new Scanner(System.in);
    private Day [] dayClass;

    public MonthSchedule(int d) {
        this.endDay = d;
        dayClass = new Day[d];

        for(int i = 0; i < dayClass.length; i++) {
            dayClass[i] = new Day();
        }
    }

    public void input() {
        System.out.print("날짜(1~" + endDay + ")?");
        int day = scanner.nextInt();

        System.out.print("할일(빈칸없이입력)?");
        String todo = scanner.next();

        dayClass[day - 1].set(todo);
    }

    public void view() {
        System.out.print("날짜(1~" + endDay + ")?");
        int day = scanner.nextInt();

        System.out.print(day + "일의 할 일은 ");
        dayClass[day - 1].show();
    }

    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");

        while(true) {
            System.out.print("할일(입력: 1, 보기:2, 끝내기: 3) >>");
            int userInput = scanner.nextInt();

            if(userInput == 1) {
                input();
            }
            else if(userInput == 2) {
                view();
            }
            else if(userInput == 3) {
                finish();
                break;
            }

            System.out.println();
        }
    }
}

public class ch4exercise7 {
    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}
