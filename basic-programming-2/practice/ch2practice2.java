
		//if�� ������ �Ǻ�

import java.util.Scanner;

public class ch2practice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int a = scanner.nextInt();
		int tens = a/10;
		int units = a%10;
		if(tens==units)
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("No, 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		scanner.close();
	}
}
