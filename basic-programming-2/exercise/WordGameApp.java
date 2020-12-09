
import java.util.Scanner;

class Player {
	String name;
	public Player(String name) {
		this.name = name;
	}
	//public static String getWordFromUser() {


	
	public static Boolean checkSuccess(String bWord, String pWord) {
		return pWord.charAt(0) == bWord.charAt(bWord.length()-1);
	}
}

public class WordGameApp {

	public static void main(String[] args) {
		System.out.println("�����ձ� ������ �����մϴ�...");
		run();
	}
	
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		int number = scanner.nextInt();
		
		Player [] p;
		p = new Player[number];
		
		for(int i=0; i<number; i++) {
			System.out.print("�������� �̸��� �Է��ϼ���>");
			String name = scanner.next();
			p[i] = new Player(name);
		}
		
		
		String bWord = "�ƹ���";
		while(bWord.length()>0) {
			for(int i=0; i<number; i++) {
				String player = p[i].name;
				System.out.print(player + ">>");
				String pWord = scanner.next();
				//Player.getWordFromUser();
				if (Player.checkSuccess(bWord, pWord) == true) {

					bWord = pWord;
					continue;
				}
				else {
					bWord = "";
					System.out.println(player + "�� �����ϴ�.");
					break;
				}
			}
		}
		scanner.close();
	}
}