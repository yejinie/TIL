
import java.util.Scanner;

public class ch2practice8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� (x1, y1)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		boolean a = inRect(x1, y1, 100, 100, 200, 200);
		System.out.print("�ι�° �� (x2, y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		boolean b = inRect(x2, y2, 100, 100, 200, 200);
		if(a == true || b == true)
			System.out.println("�� ���簢���� �浹�մϴ�.");
		else
			System.out.println("�� ���簢���� �浹���� �ʽ��ϴ�.");
		scanner.close();
	}
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
}
