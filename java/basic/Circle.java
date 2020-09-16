package sampleCode;

public class Circle {
	int radius;
	String name; //field
	
	public Circle() { //매개 변수 없는 생성자
		radius = 1; name = ""; //초기화
	}
	
	public Circle(int r, String n) { //매개 변수 있는 생성자
		radius = r; name = n; //매개 변수로 초기화
	}
	
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "자바피자"); //객체 생성, 반지름과 이름 매개 변수 전달 -> 초기화
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		Circle donut = new Circle(); //이름 초기화, 반지름은 1로
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
