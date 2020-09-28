package exercises;

import java.util.Scanner;

public class ch2practice8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점 (x,y)의 좌표를 입력하시오>>");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		boolean c = inRect(a, b, 100, 100, 200, 200);
		if(c == true)
			System.out.println("두 직사각형이 충돌합니다.");
		else
			System.out.println("두 직사각형은 충돌하지 않습니다.");
		scanner.close();
	}
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}
}
