import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char charArray [];
		System.out.print("���ܾ �Է��ϼ���: ");
		String word = scanner.next();
		charArray = word.toCharArray();
		System.out.print("�Ųٷε� �ܾ��: ");
		for(int i=word.length() -1; i>=0 ; i--) {
			System.out.print(charArray[i]);
		}
		scanner.close();
	}
}