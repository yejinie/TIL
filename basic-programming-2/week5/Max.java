import java.util.Scanner;

public class Max {
	public static void main(String [] args) {
		System.out.print("정수를 입력하세요 ");
		Scanner scanner = new Scanner(System.in);
		int first = 0;
		int second = 0;
		int number = 0;
		while (true) {
			number = scanner.nextInt();
			if (number > first) {
				second = first;
				first = number;
			}
			else if (number > second) {
				second = number;
			}
		
			if (number==0)
				break;
		}
		System.out.println("가장 큰 수는 " + first);
		System.out.println("두 번째 큰 수는 " + second);
		scanner.close();
	}
}