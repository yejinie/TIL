
		//Scanner, �ڵ� ����ȯ ����

import java.util.Scanner;

public class ch2practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int kwon = scanner.nextInt();
		double dollar = kwon/1100;
		System.out.println(kwon + "���� $" + dollar + "�Դϴ�.");
		scanner.close();
	}
}