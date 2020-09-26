package exercises;

import java.util.Scanner;

public class ch2practice5 {
	public static void main(String[] args) {
		System.out.print("정수 3개를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int first = 0;
		int sum = 0;
		for(int i=0; i<3; i++) {
			int number = scanner.nextInt();
			if (number>first) {
				sum = sum+first;
				first = number;
			}
			else
				sum = sum+number;	
		}
		if (sum>first)
			System.out.println("삼각형이 됩니다");
		else
			System.out.println("삼각형이 아닙니다");
		scanner.close();
	}
}
