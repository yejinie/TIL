package exercises;

import java.util.Scanner;

public class ch2practice3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int kwon = scanner.nextInt();
		int a = kwon/50000;
		System.out.println("5만원권 " + a + "매");
		kwon = kwon - 50000 * a;
		int b = kwon/10000;
		System.out.println("1만원권 " + b + "매");
		kwon = kwon - 10000 * b ;
		int d = kwon/1000;
		System.out.println("천원권 " + d + "매");
		scanner.close();
	}
}