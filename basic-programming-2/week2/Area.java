import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("������ ������ �Է����ּ���.");
		String figure = scanner.next();
		double area = 0;
		switch (figure) {
			case "�ﰢ��":
				System.out.println("�غ�, ���̸� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
				double base = scanner.nextDouble();
				double height = scanner.nextDouble();
				area = base * height * 1/2;
				break;
			case "��":
				System.out.println("�������� �Է��ϼ���.");
				double radius = scanner.nextDouble();
				final double PI = 3.14;
				area = PI * radius * radius;
				break;	
			case "�簢��":
				System.out.println("����, ���� ���̸� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
				double width = scanner.nextDouble();
				double length = scanner.nextDouble();
				area = width * length;
				break;
			case "������":
				System.out.println("�� �밢���� ���̸� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
				double a = scanner.nextDouble();
				double b = scanner.nextDouble();
				area = a * b * 1/2;
				break;
			case "��ٸ���":
				System.out.println("�غ�, ����, ���̸� ��ĭ���� �и��Ͽ� �Է��ϼ���.");
				double w = scanner.nextDouble();
				double u = scanner.nextDouble();
				double h = scanner.nextDouble();
				area = (w + u) * h * 1/2;
				break;
			default:
				System.out.println("������ �����ϴ�!");
		}
		if(area != 0)
			System.out.print(figure + "�� ���̴� " + area + "�Դϴ�.");
		scanner.close();
	}
	
}
