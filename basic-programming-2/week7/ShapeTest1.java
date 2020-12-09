package week7;

abstract class Shape implements Drawable {
	final public double PI = 3.141592;
	double x1, y1, x2, y2, x, y, r;
	abstract public double getArea();
	abstract public double getLength();
	abstract public void draw();
}

class Rectangle extends Shape {
	public Rectangle(double a, double b, double c, double d) {
		x1 = a; y1 = b; x2 = a+c; y2 = b+d;
	}
	@Override
	public double getArea() {
		return (x2-x1)*(y2-y1);
	}
	@Override
	public double getLength() {
		return (x2-x1)*2+(y2-y1)*2;
	}
	@Override
	public void draw() {
		System.out.println("Rectangle ("+x1+", "+y1+")-("+x2+", "+y2+")");
	}
}

class Circle extends Shape {
	public Circle(double d, double e, double f) {
		x = d; y = e; r = f;
	}
	@Override
	public double getArea() {
		return PI*r*r;
	}
	@Override
	public double getLength() {
		return 2*PI*r;
	}
	@Override
	public void draw() {
			System.out.println("Circle center("+x+", "+y+")-radius("+r+")");	
	}
}

public class ShapeTest1 {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10, 20, 30, 40);
		shapes[1] = new Rectangle(30, 30, 10, 10);
		shapes[2] = new Circle(50, 20, 30);
		
		for(Shape s: shapes) {
			System.out.printf("Area: %.1f\n", s.getArea());
			System.out.printf("Length: %.1f\n", s.getLength());
		}
		
		Drawable[] drawables = new Drawable[3];
		for(int i=0; i<shapes.length; i++) {
			drawables[i] = (Drawable) shapes[i];	
		}
		
		for(Drawable d: drawables) {
			d.draw();
		}
	}
}