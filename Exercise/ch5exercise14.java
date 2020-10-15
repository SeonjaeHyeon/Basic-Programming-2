// Exercise 5-14

interface Shape {
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape {
    private int radius;
    
    public Circle(int r) {
        this.radius = r;
    }
    
    @Override
    public void draw() {
        System.out.println("반지름이 " + this.radius + "인 원입니다.");
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }
}

class Oval implements Shape {
    private int a, b;
    
    public Oval(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void draw() {
        System.out.println(this.a + "x" + this.b + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea() {
        return a * b * PI;
    }
}

class Rect implements Shape {
    private int width, height;

    public Rect(double w, double h) {
        this.width = w;
        this.height = h;
    }

    @Override
    public void draw() {
        System.out.println(this.width + "x" + this.height + "크기의 사각형입니다.");
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }
}

public class ch5exercise14 {
    public static void main(String[] args) {
        Shape [] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);
        
        for(int i = 0; i < list.length; i++) list[i].redraw();
        for(int i = 0; i < list.length; i++) System.out.println("면적은 " + list[i].getArea());
    }
}
