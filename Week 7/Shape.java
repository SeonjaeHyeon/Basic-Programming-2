// 60201716 현선재

package shape;

public abstract class Shape implements Drawable {
	protected double x, y;
	public abstract double getArea();
	public abstract double getLength();
}

class Rectangle extends Shape {
	private double width, height;
	
	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
	}
	
	@Override
	public double getArea() {
		return this.width * this.height;
	}
	
	@Override
	public double getLength() {
		return (this.width + this.height) * 2.0;
	}
	
	@Override
	public void draw() {
		System.out.println("Rectangle (" + this.x + ", " + this.y + ")-(" + (this.x + this.width) + ", " + (this.y + this.height) + ")");
	}
}

class Circle extends Shape {
	private final double PI = 3.141592;
	private double radius;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y= y;
		this.radius = r;
	}
	
	@Override
	public double getArea() {
		return this.radius * this.radius * PI;
	}
	
	@Override
	public double getLength() {
		return this.radius * PI * 2.0;
	}
	
	@Override
	public void draw() {
		System.out.println("Circle center(" + this.x + ", " + this.y + ")-radius(" + this.radius + ")");
	}
}
