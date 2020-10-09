// 60201716 현선재

interface Shape {
	final double PI = 3.14;
	void draw();  // abstract method
	double getArea();  // abstract method
	default public void redraw() {  // default method
		System.out.print("---다시 그립니다.");
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
		System.out.println(" 반지름이 " + radius + "인 원입니다.");
	}
	
	@Override
	public double getArea() {
		return radius * radius * PI;
	}
}

class Triangle implements Shape {
	private int height;
	private int width;
	
	public Triangle(int h, int w) {
		this.height = h;
		this.width = w;
	}
	
	@Override
	public void draw() {
		System.out.println(" 높이:" + height + ", 밑변:" + width + "의 삼각형입니다.");
	}
	
	@Override
	public double getArea() {
		return height * width / 2.0;
	}
}

class Rect implements Shape {
	private int height;
	private int width;
	
	public Rect(int h, int w) {
		this.height = h;
		this.width = w;
	}
	
	@Override
	public void draw() {
		System.out.println(" " + height + "x" + width + "크기의 사각형 입니다.");
	}
	
	@Override
	public double getArea() {
		return height * width;
	}
}

public class figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape [] list = new Shape[3];

		list[0] = new Circle(10);
		list[1] = new Triangle(20, 30);  // (높이: 20, 밑변: 30)의 삼각형
		list[2] = new Rect(10, 40);  // (10x40) 크기의 사각형
		
		for(int i = 0; i < list.length; i++) list[i].redraw();
		for(int i = 0; i < list.length; i++)
			System.out.println("면적은 " + list[i].getArea());
		
		// 가장 면적이 큰 도형 구하기
		double maximum = 0.0;
		for(int i = 0; i < list.length; i++) {
			if(list[i].getArea() > maximum) {
				maximum = list[i].getArea();
			}
		}
		System.out.println("-- 가장 큰 면적은 " + maximum + "입니다");
	}

}
