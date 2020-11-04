// Exercise 7-5

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Student {
    private String name;
    private String major;
    private int number;
    private double grade;

    public Student(String name, String major, int number, double grade) {
        this.name = name;
        this.major = major;
        this.number = number;
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public String getMajor() {
        return this.major;
    }

    public int getNumber() {
        return this.number;
    }

    public double getGrade() {
        return this.grade;
    }
}

public class ch7exercise5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("ArrayList 이용");

        var studentInfo = new ArrayList<Student>();
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        for(int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String name = scanner.next().replace(",", "");
            String major = scanner.next().replace(",", "");
            int number = Integer.parseInt(scanner.next().replace(",", ""));
            double grade = scanner.nextDouble();
            
            studentInfo.add(new Student(name, major, number, grade));
        }

        var it = studentInfo.iterator();
        System.out.println("------------------");
        while(it.hasNext()) {
            Student s = it.next();
            System.out.println("이름:" + s.getName());
            System.out.println("학과:" + s.getMajor());
            System.out.println("학번:" + s.getNumber());
            System.out.println("학점평균:" + s.getGrade());
            System.out.println("------------------");
        }

        while(true) {
            it = studentInfo.iterator();
            System.out.print("학생 이름 >> ");
            String input = scanner.next();
            if(input.equals("그만")) {
                break;
            }

            while(it.hasNext()) {
                Student s = it.next();
                if(s.getName().equals(input)) {
                    System.out.println(s.getName() + ", " + s.getMajor() + ", " + s.getNumber() + ", " + s.getGrade());
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("HashMap 이용");

        var studentInfo2 = new HashMap<String, Student>();
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        for(int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String name = scanner.next().replace(",", "");
            String major = scanner.next().replace(",", "");
            int number = Integer.parseInt(scanner.next().replace(",", ""));
            double grade = scanner.nextDouble();
            
            studentInfo2.put(name, new Student(name, major, number, grade));
        }

        var keys = studentInfo2.keySet();
        var it2 = keys.iterator();
        System.out.println("------------------");
        while(it2.hasNext()) {
            String key = it2.next();
            Student s = studentInfo2.get(key);
            System.out.println("이름:" + s.getName());
            System.out.println("학과:" + s.getMajor());
            System.out.println("학번:" + s.getNumber());
            System.out.println("학점평균:" + s.getGrade());
            System.out.println("------------------");
        }

        while(true) {
            System.out.print("학생 이름 >> ");
            String input = scanner.next();
            if(input.equals("그만")) {
                break;
            }

            Student s = studentInfo2.get(input);
            System.out.println(s.getName() + ", " + s.getMajor() + ", " + s.getNumber() + ", " + s.getGrade());
        }

        scanner.close();
    }   
}
