
import java.util.Scanner;

public class ch3practice4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = "abcdefghijklmnopqrstuvwxyz";
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		char al = scanner.next().charAt(0);
		int p=0;
		while(true) {
			if(string.charAt(p)==al) break;
			else p++;
		}
		for(int i=p; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print(string.charAt(j));
			}
			System.out.println();
		}

		scanner.close();
	}
}
