import java.util.Scanner;

public class Minus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>> ");
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
