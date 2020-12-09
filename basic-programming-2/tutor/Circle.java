//practice2
public class Circle {
	private int x, y, radius;
	
	public Circle(int x, int y, int radius) {
		this.x=x; this.y=y; this.radius=radius;
	}
	
	public String toString() {
		return "Circle("+x+","+y+")������"+radius;
	}
	
	public boolean equals(Object c) {
		Circle circle = (Circle)c;
		if(x==circle.x && y==circle.y) return true;
		else return false;
	}

	public static void main(String[] args) {
		Circle a = new Circle(2,3,5);
		Circle b = new Circle(2,3,30);
		System.out.println("�� a : "+a);
		System.out.println("�� b : "+b);
		if(a.equals(b)) System.out.println("���� ��");
		else System.out.println("���� �ٸ� ��");
	}

}
