
import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int kwon = scanner.nextInt();
		int num = kwon/50000;
		System.out.println("�������� "+num+"��");
		kwon = kwon - 50000*num;
		num = kwon/10000;
		System.out.println("������ "+num+"��");
		kwon = kwon - 10000*num;
		num = kwon/1000;
		System.out.println("õ���� "+num+"��");
		kwon = kwon - 1000*num;
		num = kwon/100;
		System.out.println("��� "+num+"��");
		kwon = kwon - 100*num;
		num = kwon/50;
		System.out.println("���ʿ� "+num+"��");
		kwon = kwon - 50*num;
		num = kwon/10;
		System.out.println("�ʿ� "+num+"��");
		kwon = kwon - 10*num;
		num = kwon/1;
		System.out.println("�Ͽ� "+num+"��");
		scanner.close();
	}
}
