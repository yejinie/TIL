import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char charArray [];
		System.out.print("영단어를 입력하세요: ");
		String word = scanner.next();
		charArray = word.toCharArray();
		System.out.print("거꾸로된 단어는: ");
		for(int i=word.length() -1; i>=0 ; i--) {
			System.out.print(charArray[i]);
		}
		scanner.close();
	}
}