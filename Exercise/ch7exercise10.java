import java.util.*;

abstract class Shape {
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

public class ch7exercise10 {
    public static void main(String[] args) {
       Vector<Shape> v = new Vector<Shape>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("그래픽 에디터 beauty를 실행합니다.");

        int input;
        while(true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            input = scanner.nextInt();
            
            if(input == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                input = scanner.nextInt();

                if(input == 1) {
                    v.add(new Line());
                }
                else if(input == 2) {
                    v.add(new Rect());
                }
                else if(input == 3) {
                    v.add(new Circle());
                }
            }
            else if(input == 2) {
                System.out.print("삭제할 도형의 위치>>");
                input = scanner.nextInt();
                
                if(input > v.size() - 1) {
                   System.out.println("삭제할 수 없습니다.");
                }
                else {
                   v.remove(input);
                }
            }
            else if(input == 3) {
                for(int i = 0; i < v.size(); i++) {
                   v.get(i).draw();
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