import java.util.Scanner;

class Dictionary {
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		return null;
	}
}

public class DicApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			String word = scanner.next();
			if(word.equals("�׸�"))
				break;
			String toword = Dictionary.kor2Eng(word);
			if(toword==null) {
				System.out.println(word+"�� ���� ������ �����ϴ�.");
			}
			else
				System.out.println(word+"�� "+toword);
		}
		scanner.close();
	}

}
