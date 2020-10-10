// Exercise 4-6

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;
    
    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.println("(" + this.x + "," + this.y + ")" + this.radius);
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class ch4exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle[3];

        for(int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int r = scanner.nextInt();

            c[i] = new Circle(x, y, r);
        }

        double max = 0.0;
        int index = 0;
        for(int i = 0; i < c.length; i++) {
            if(c[i].getArea() > max) {
                max = c[i].getArea();
                index = i;
            }
        }

        System.out.print("가장 면적이 큰 원은 ");
        c[index].show();

        scanner.close();
    }
}
