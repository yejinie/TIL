

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("한 줄에 하나씩 정수를 입력하고, 종료하고 싶으면 0을 입력하세요.");
		int first = 0;
		int second = 0;
		while(true) {
			System.out.print("Enter an integer: ");
			int a = scanner.nextInt();
			if(a>first) {
				second = first;
				first = a;
			}
			else if(a>second) {
				second = a;
			}
			if(a==0)
				break;
		}
		System.out.println("가장 큰 정수는 "+first);
		System.out.println("두번째로 큰 정수는 "+second);
		scanner.close();
	}
}
