// Exercise 4-2

import java.util.Scanner;

class Grade {
    private int math;
    private int science;
    private int english;

    public Grade(int m, int s, int e) {
        this.math = m;
        this.science = s;
        this.english = e;
    }

    public int average() {
        return (this.math + this.science + this.english) / 3;
    }
}

public class ch4exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());

        scanner.close();
    }
}
