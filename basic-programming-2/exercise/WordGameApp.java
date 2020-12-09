
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
		System.out.println("끝말잇기 게임을 시작합니다...");
		run();
	}
	
	public static void run() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		int number = scanner.nextInt();
		
		Player [] p;
		p = new Player[number];
		
		for(int i=0; i<number; i++) {
			System.out.print("참가자의 이름을 입력하세요>");
			String name = scanner.next();
			p[i] = new Player(name);
		}
		
		
		String bWord = "아버지";
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
					System.out.println(player + "이 졌습니다.");
					break;
				}
			}
		}
		scanner.close();
	}
}