
import java.util.Scanner;

public class ch2practice5 {
	public static void main(String[] args) {
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		int first = 0;
		int sum = 0;
		for(int i=0; i<3; i++) {
			int number = scanner.nextInt();
			if (number>first) {
				sum = sum+first;
				first = number;
			}
			else
				sum = sum+number;	
		}
		if (sum>first)
			System.out.println("�ﰢ���� �˴ϴ�");
		else
			System.out.println("�ﰢ���� �ƴմϴ�");
		scanner.close();
	}
}
