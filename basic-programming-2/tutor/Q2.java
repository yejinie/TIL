

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� �ٿ� �ϳ��� ������ �Է��ϰ�, �����ϰ� ������ 0�� �Է��ϼ���.");
		int first = 0;
		int second = 0;
		while(true) {
			System.out.print("Enter an integer: ");
			int a = scanner.nextInt();
			if(a>first) {
				second = first;
				first = a;
			}
			else if(a>second) {
				second = a;
			}
			if(a==0)
				break;
		}
		System.out.println("���� ū ������ "+first);
		System.out.println("�ι�°�� ū ������ "+second);
		scanner.close();
	}
}
