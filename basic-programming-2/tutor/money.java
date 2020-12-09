
import java.util.Scanner;

public class money {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오>>");
		int kwon = scanner.nextInt();
		int num = kwon/50000;
		System.out.println("오만원권 "+num+"매");
		kwon = kwon - 50000*num;
		num = kwon/10000;
		System.out.println("만원권 "+num+"매");
		kwon = kwon - 10000*num;
		num = kwon/1000;
		System.out.println("천원권 "+num+"매");
		kwon = kwon - 1000*num;
		num = kwon/100;
		System.out.println("백원 "+num+"개");
		kwon = kwon - 100*num;
		num = kwon/50;
		System.out.println("오십원 "+num+"개");
		kwon = kwon - 50*num;
		num = kwon/10;
		System.out.println("십원 "+num+"개");
		kwon = kwon - 10*num;
		num = kwon/1;
		System.out.println("일원 "+num+"개");
		scanner.close();
	}
}
