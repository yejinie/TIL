import java.util.Scanner;

public class Minus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>> ");
		int i = scanner.nextInt();
		while (i>0) {
			for(int j = i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
			i--;
		}
		scanner.close();
	}
}
