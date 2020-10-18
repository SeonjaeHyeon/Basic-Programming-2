// Exercise 5-12

import java.util.Scanner;

abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; }
    public Shape getNext() { return next; }
    public abstract void draw();
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class ch5exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape start = null;
        Shape last = null;
        Shape obj;

        System.out.println("그래픽 에디터 beauty를 실행합니다.");

        int input;
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            input = scanner.nextInt();
            
            if(input == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                input = scanner.nextInt();

                if(input == 1) {
                    if(start == null) {
                        start = new Line();
                        last = start;
                    }
                    else {
                        obj = new Line();
                        last.setNext(obj);
                        last = obj;
                    }
                }
                else if(input == 2) {
                    if(start == null) {
                        start = new Rect();
                        last = start;
                    }
                    else {
                        obj = new Rect();
                        last.setNext(obj);
                        last = obj;
                    }
                }
                else if(input == 3) {
                    if(start == null) {
                        start = new Circle();
                        last = start;
                    }
                    else {
                        obj = new Circle();
                        last.setNext(obj);
                        last = obj;
                    }
                }
            }
            else if(input == 2) {
                System.out.print("삭제할 도형의 위치>>");
                input = scanner.nextInt();

                Shape d = start;
                for(int i = 1; d != null; i++) {
                    if(input == 1) {
                        start = d.getNext();

                        break;
                    }
                    else if(i == input - 1) {
                        if(d.getNext() == null) {
                            d = null;

                            break;
                        }

                        d.setNext(d.getNext().getNext());

                        if(d.getNext() == null) {
                            last = d;
                        }

                        break;
                    }

                    d = d.getNext();
                }

                if(d == null) {
                    System.out.println("삭제할 수 없습니다.");
                }
            }
            else if(input == 3) {
                Shape v = start;
                while(v != null) {
                    v.draw();
                    v = v.getNext();
                }
            }
            else if(input == 4) {
                System.out.println("beauty를 종료합니다.");

                break;
            }
        }

        scanner.close();
    }
}
