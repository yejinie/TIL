package week8;
import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("���� ������ �Է��ϼ���: ");
			int num = scanner.nextInt();
			if(num<=0) break;
			if(num%2==0) {
				sum += num;
			}
		}
		System.out.println("�Է��� ���� ���� �߿��� ¦���� ���� "+sum);
		scanner.close();
	}
}
