interface Shape {
	final double PI=3.14;
	void draw(); 
	double getArea();
	default public void redraw() {
		System.out.print("---다시 그립니다. ");
		draw();
	}
}

class Circle implements Shape {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
	}
	@Override
	public double getArea() {
		return PI*radius*radius;
	}
}

class Triangle implements Shape {
	private int height;
	private int base;
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}
	@Override
	public void draw() {
		System.out.println("높이:"+height+", 밑변:"+base+"의 삼각형입니다.");
	}
	@Override
	public double getArea() {
		return base*height*1/2;
	}
}

class Rect implements Shape {
	private int width;
	private int length;
	public Rect(int width, int length) {
		this.width = width;
		this.length = length;
	}
	@Override
	public void draw() {
		System.out.println(width+"x"+length+"크기의 사각형 입니다.");
	}
	@Override
	public double getArea() {
		return width*length;
	}
}


public class Area {
	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Triangle(20,30);
		list[2] = new Rect(10,40); 
		double largest = 0;
		for(int i = 0; i<list.length; i++) list[i].redraw();
		for(int i = 0; i< list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
			if(list[i].getArea()>largest)
				largest = list[i].getArea();
		}
		System.out.println("-- 가장 큰 면적은 "+largest+"입니다.");
	}

}
