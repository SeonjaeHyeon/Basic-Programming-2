// Open Challenge 5

import java.util.Random;
import java.util.Scanner;

abstract class GameObject {  // 추상 클래스
    protected int distance;  // 한 번 이동 거리
    protected int x, y;  // 현재 위치(화면 맵 상의 위치)
    protected Scanner scanner = new Scanner(System.in);

    public GameObject(int startX, int startY, int distance) {  // 초기 위치와 이동 거리 설정
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean collide(GameObject p) {  // 이 객체가 객체 p와 충돌했으면 true 리턴
        if(this.x == p.getX() && this.y == p.getY()) {
            return true;
        }
        else {
            return false;
        }
    }

    protected abstract void move();  // 이동한 후의 새로운 위치로 x, y 변경
    protected abstract char getShape();  // 객체의 모양을 나타내는 문자 리턴
}

class Bear extends GameObject {
    public Bear(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    protected void move() {
        System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
        String d = scanner.next();

        if(d.equals("a")) {
            this.x -= this.distance;

            if(this.x < 0) {
                this.x = 0;
            }
        }
        else if(d.equals("s")) {
            this.y += this.distance;

            if(this.y > 9) {
                this.y = 9;
            }
        }
        else if(d.equals("d")) {
            this.y -= this.distance;

            if(this.y < 0) {
                this.y = 0;
            }
        }
        else if(d.equals("f")) {
            this.x += this.distance;

            if(this.x > 19) {
                this.x = 19;
            }
        }
    }

    protected char getShape() {
        return 'B';
    }
}

class Fish extends GameObject {
    private Random r = new Random();
    private int count = 0;

    public Fish(int startX, int startY, int distance) {
        super(startX, startY, distance);
    }

    protected void move() {
        if(count < 3) {
            count++;
            return;
        }
        else if(count == 4) {
            count = 0;
        }
        else {
            count++;
        }

        int d = r.nextInt(3);

        if(d == 0) {
            this.x -= this.distance;

            if(this.x < 0) {
                this.x = 1;
            }
        }
        else if(d == 1) {
            this.y += this.distance;

            if(this.y > 9) {
                this.y = 8;
            }
        }
        else if(d == 2) {
            this.y -= this.distance;

            if(this.y < 0) {
                this.y = 1;
            }
        }
        else if(d == 3) {
            this.x += this.distance;

            if(this.y > 19) {
                this.y = 18;
            }
        }
    }

    protected char getShape() {
        return '@';
    }
}

public class ch5challenge {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
        Bear b_player = new Bear(r.nextInt(19), r.nextInt(9), 1);
        Fish f_player = new Fish(r.nextInt(19), r.nextInt(9), 1);

        boolean isCollide = false; 
        while(!isCollide) {
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 20; j++) {
                    if(b_player.getX() == j && b_player.getY() == i) {
                        System.out.print(b_player.getShape());
                    }
                    else if(f_player.getX() == j && f_player.getY() == i) {
                        System.out.print(f_player.getShape());
                    }
                    else {
                        System.out.print("-");
                    }
                }
                System.out.println();
            }

            b_player.move();
            f_player.move();

            if(b_player.collide(f_player)) {
                for(int i = 0; i < 10; i++) {
                    for(int j = 0; j < 20; j++) {
                        if(b_player.getX() == j && b_player.getY() == i) {
                            System.out.print(b_player.getShape());
                        }
                        else {
                            System.out.print("-");
                        }
                    }
                    System.out.println();
                }

                System.out.println("Bear Wins!!");
                break;
            }
        }
    }
}
