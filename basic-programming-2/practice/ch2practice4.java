
import java.util.Scanner;

public class ch2practice4 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("���� 3�� �Է�>>");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = scanner.nextInt();
	if(a>b) {
		if (a>c) {
			if (b>c)
				System.out.println("�߰� ���� " + b);
			else
				System.out.println(c);
		}
		else {
			System.out.println(a);
		}
	}
	else {
		if (c>a) {
			if (b>c)
				System.out.println(c);
			else
				System.out.println(b);
		}
		else
			System.out.println(a);
	}
	scanner.close();
	}
}
