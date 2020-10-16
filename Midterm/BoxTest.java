// 60201716 현선재

import java.util.Scanner;

class Box {
	private int width;
	private int length;
	private int height;
	private int volume;
	
	private static int boxes = 0;
	
	public Box() {
		this(10, 10, 10);
	}
	
	public Box(int w, int l, int h) {
		this.width = w;
		this.length = l;
		this.height = h;
		this.volume = calcVolume();
		
		boxes++;
	}
	
	public static int getBoxes() {
		return boxes;
	}
	
	public void setWidth(int n) {
		this.width = n;
		this.volume = calcVolume();
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setLength(int n) {
		this.length = n;
		this.volume = calcVolume();
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void setHeight(int n) {
		this.height = n;
		this.volume = calcVolume();
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setVolume(int n) {
		this.volume = n;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	private int calcVolume() {
		return this.width * this.length * this.height;
	}
	
}


public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Box [] box = new Box[3];
		
		System.out.println("Box 객체를 생성하는 프로그램입니다.");
		
		int w, l, h;
		for(int i = 0; i < 3; i++) {
			System.out.print("가로, 세로, 높이를 빈칸으로 구분하여 입력하세요. >>");
			
			w = scanner.nextInt();
			l = scanner.nextInt();
			h = scanner.nextInt();
			
			box[i] = new Box(w, l, h);
		}
		
		System.out.println("총 " + Box.getBoxes() + "개의 Box 객체가 생성되었습니다.");
		
		for(int i = 0; i < box.length; i++) {
			System.out.println((i + 1) + "번 Box 객체의 volume 값은 " + box[i].getVolume());
		}
		
		scanner.close();
	}

}
