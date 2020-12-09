

public class Circle {
	int radius;
	String name; //field
	
	public Circle() { //�Ű� ���� ���� ������
		radius = 1; name = ""; //�ʱ�ȭ
	}
	
	public Circle(int r, String n) { //�Ű� ���� �ִ� ������
		radius = r; name = n; //�Ű� ������ �ʱ�ȭ
	}
	
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "�ڹ�����"); //��ü ����, �������� �̸� �Ű� ���� ���� -> �ʱ�ȭ
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + area);
		
		Circle donut = new Circle(); //�̸� �ʱ�ȭ, �������� 1��
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + area);
	}
}
