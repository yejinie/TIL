package exercises;

import java.util.Scanner;
public class ch2practice9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 중심과 반지름 입력>>");
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.print("점 입력>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		if((cx-x)+(cy-y)<=r*r)
			System.out.println("점 ("+x+", "+y+")는 원 안에 있다.");
		else
			System.out.println("점 ("+x+", "+y+")는 원 안에 없다.");
		scanner.close();
		}
}
