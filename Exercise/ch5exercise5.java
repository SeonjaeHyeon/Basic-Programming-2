// Exercise 5-5

class Point {
    private int x, y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String c) {
        super(x, y);

        this.color = c;
    }

    public void setXY(int x, int y) {
        move(x, y);
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String toString() {
        return this.color + "색의 (" + getX() + "," + getY() + ")의 점";
    }
}

public class ch5exercise5 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("RED");
        String str = cp.toString();
        System.out.println(str + "입니다.");
    }
}
