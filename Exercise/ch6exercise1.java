// Exercise 6-1

class MyPoint {
    int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        MyPoint p = (MyPoint)obj;
        
        if(p.x == this.x && p.y == this.y) {
            return true;
        }

        return false;
    }

    public String toString() {
        return "Point(" + this.x + "," + this.y + ")";
    }
}

public class ch6exercise1 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);

        System.out.println(p);

        if(p.equals(q)) {
            System.out.println("같은 점");
        }
        else {
            System.out.println("다른 점");
        }
    }
}
