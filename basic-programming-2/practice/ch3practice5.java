
import java.util.Scanner;

public class ch3practice5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int intArray [] = new int[10];
		System.out.print("���� ���� 10���� �Է��Ͻÿ�>>");
		for(int i=0; i<10; i++) {
			intArray[i] = scanner.nextInt();
		}
		System.out.print("3�� ����� ");
		for(int i=0; i<10; i++) {
			if(intArray[i]%3==0) 
				System.out.print(intArray[i]+" ");
		}
		scanner.close();	
	}
}
