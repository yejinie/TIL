package exercises;

import java.util.Scanner;
public class ch2practice9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �߽ɰ� ������ �Է�>>");
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.print("�� �Է�>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if((cx-x)+(cy-y)<=r*r)
			System.out.println("�� ("+x+", "+y+")�� �� �ȿ� �ִ�.");
		else
			System.out.println("�� ("+x+", "+y+")�� �� �ȿ� ����.");
		scanner.close();
		}
}
