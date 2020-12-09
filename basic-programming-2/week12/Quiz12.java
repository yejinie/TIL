package quiz;
import java.util.*;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer, String> scoreMap = new HashMap<Integer, String>();
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("**Java 성적 관리 프로그램입니다**");
		while(true) {
			System.out.print("이름과 성적 입력>> ");
			String name = scanner.next();
			if(name.equals("끝"))
				break;
			int score = scanner.nextInt();

			scoreMap.put(score, name);
			v.add(score);
		}
		
		Collections.sort(v);
		Collections.reverse(v);
		
		int num = 0;
		for(int i = num; i<v.size()*0.1; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "A (10%)");
		}
		for(int i = num; i<v.size()*0.2; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "A (20%)");
		}
		for(int i = num; i<v.size()*0.3; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "B (30%)");
		}
		for(int i = num; i<v.size()*0.4; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "B (40%)");
		}
		for(int i = num; i<v.size()*0.5; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "B (50%)");
		}
		for(int i = num; i<v.size()*0.6; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "C (60%)");
		}
		for(int i = num; i<v.size()*0.7; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "C (70%)");
		}
		for(int i = num; i<v.size()*0.8; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "D (80%)");
		}
		for(int i = num; i<v.size()*0.9; i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "D (90%)");
		}
		for(int i = num; i<v.size(); i++, num++) {
			System.out.println(scoreMap.get(v.elementAt(i))+" "+ "F (100%)");
		}
		
		scanner.close();
	}

}
