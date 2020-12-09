import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operator = scanner.next();
		
		if (operator.equals("+")) {
			Add.setValue(a, b);
			System.out.println(Add.calculate());
		}
		else if (operator.equals("-")) {
			Sub.setValue(a, b);
			System.out.println(Sub.calculate());
		}
		else if (operator.equals("*")) {
			Mul.setValue(a, b);
			System.out.println(Mul.calculate());
		}
		else if (operator.equals("/")) {
			Div.setValue(a, b);
			System.out.println(Div.calculate());
		}
		else if (operator.equals("%")) {
			Rem.setValue(a, b);
			System.out.println(Rem.calculate());
		}
		scanner.close();
	}
}

class Add {
	public static int a;
	public static int b;
	
	static void setValue(int a, int b) {
		Add.a = a;
		Add.b = b;
	}
	
	public static int calculate() {
		int number = a + b;
		return number;
	}
}
class Sub {
	public static int a;
	public static int b;
	
	static void setValue(int a, int b) {
		Sub.a = a;
		Sub.b = b;
	}
	
	public static int calculate() {
		int number = a - b;
		return number;
	}
}
class Mul {
	public static int a;
	public static int b;
	
	static void setValue(int a, int b) {
		Mul.a = a;
		Mul.b = b;
	}
	
	public static int calculate() {
		int number = a * b;
		return number;
	}
}
class Div {
	public static int a;
	public static int b;
	
	static void setValue(int a, int b) {
		Div.a = a;
		Div.b = b;
	}
	
	public static int calculate() {
		int number = a / b;
		return number;
	}
}
class Rem {
	public static int a;
	public static int b;
	
	static void setValue(int a, int b) {
		Rem.a = a;
		Rem.b = b;
	}
	
	public static int calculate() {
		int number = a % b;
		return number;
	}
}