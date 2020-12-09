
import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"�� "+getDestString()+"�� �ٲߴϴ�.");
		System.out.print(getSrcString()+"�� �Է��ϼ���>>");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ���: "+res+getDestString()+"�Դϴ�");
		scanner.close();
	}
}

class Km2Mile extends Converter {
	public Km2Mile(double km) {
		this.ratio = 1/km;
	}
	@Override
	public double convert(double src) {
		return src*ratio;
	}
	@Override
	public String getSrcString() {
		return "Km";
	}
	@Override
	public String getDestString() {
		return "mile";
	}
}

public class Q3 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}