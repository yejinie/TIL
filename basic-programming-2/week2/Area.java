import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("도형의 종류를 입력해주세요.");
		String figure = scanner.next();
		double area = 0;
		switch (figure) {
			case "삼각형":
				System.out.println("밑변, 높이를 빈칸으로 분리하여 입력하세요.");
				double base = scanner.nextDouble();
				double height = scanner.nextDouble();
				area = base * height * 1/2;
				break;
			case "원":
				System.out.println("반지름을 입력하세요.");
				double radius = scanner.nextDouble();
				final double PI = 3.14;
				area = PI * radius * radius;
				break;	
			case "사각형":
				System.out.println("가로, 세로 길이를 빈칸으로 분리하여 입력하세요.");
				double width = scanner.nextDouble();
				double length = scanner.nextDouble();
				area = width * length;
				break;
			case "마름모":
				System.out.println("두 대각선의 길이를 빈칸으로 분리하여 입력하세요.");
				double a = scanner.nextDouble();
				double b = scanner.nextDouble();
				area = a * b * 1/2;
				break;
			case "사다리꼴":
				System.out.println("밑변, 윗변, 높이를 빈칸으로 분리하여 입력하세요.");
				double w = scanner.nextDouble();
				double u = scanner.nextDouble();
				double h = scanner.nextDouble();
				area = (w + u) * h * 1/2;
				break;
			default:
				System.out.println("도형이 없습니다!");
		}
		if(area != 0)
			System.out.print(figure + "의 넓이는 " + area + "입니다.");
		scanner.close();
	}
	
}
