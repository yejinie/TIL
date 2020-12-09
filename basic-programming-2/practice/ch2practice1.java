
		//Scanner, 자동 형변환 연습

import java.util.Scanner;

public class ch2practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		int kwon = scanner.nextInt();
		double dollar = kwon/1100;
		System.out.println(kwon + "원은 $" + dollar + "입니다.");
		scanner.close();
	}
}