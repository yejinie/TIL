
import java.util.Scanner;

public class ch2practice7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if(100<=x && x<=200 && 100<=y && y<=200)
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
		else
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �����ϴ�.");
		scanner.close();	
	}
}
