
import java.util.Scanner;

public class ch2practice6 {
	public static void main(String[] args) {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int numOf369 = 0;
		int res = number/10;
		if(res == 3 || res == 6 || res == 9) 
			numOf369 = numOf369 + 1;
		res = number%10;
		if(res == 3 || res == 6 || res == 9) 
			numOf369 = numOf369 + 1;
		if(numOf369==1)
			System.out.println("�ڼ�¦");
		else if(numOf369==2)
			System.out.println("�ڼ�¦¦");
		scanner.close();
	}
}