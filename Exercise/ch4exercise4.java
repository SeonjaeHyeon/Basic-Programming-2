// Exercise 4-4

class Rectangle {
    public int x;
    public int y;
    public int width;
    public int height;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public int square() {
        return this.width * this.height;
    }

    public void show() {
        System.out.println("(" + this.x + "," + this.y + ")에서 크기가 " + this.width + "x" + this.height + "인 사각형");
    }

    public boolean contains(Rectangle r) {
        if((r.x > this.x && r.y > this.y) && (r.x + r.width < this.x + this.width && r.y + r.height < this.y + this.height)) {
            return true;
        }
        else {
            return false;
        }
    }
}

public class ch4exercise4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
    }
}
