

import java.util.Scanner;

public class ch2practice12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		int a = scanner.nextInt();
		String cal = scanner.next();
		int b = scanner.nextInt();
		if(cal.equals("+"))
			System.out.println(a+"+"+b+"의 계산 결과는 "+(a+b));
		else if(cal.equals("-"))
			System.out.println(a+"-"+b+"의 계산 결과는 "+(a-b));
		else if(cal.equals("*"))
			System.out.println(a+"*"+b+"의 계산 결과는 "+(a*b));
		else
			System.out.println(a+"/"+b+"의 계산 결과는 "+((double)a/(double)b));
		scanner.close();
	}
}
