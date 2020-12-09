import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> map = new HashMap<String, Double>();
		System.out.println("명지 장학금 관리 시스템입니다. 이름과 학점을 입력하세요.");
		while(true) {
			System.out.print("이름과 학점>> ");
			String str = scanner.next();
			if(str.equals("그만")) break;
			else {
				String name = str;
				double score = scanner.nextDouble();
				map.put(name, score);
			}
		}
		System.out.print("장학생 선발 기준을 입력하세요>> ");
		double std = scanner.nextDouble();
		
		System.out.print("장학생 명단: ");
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			double score = map.get(name);
			if(score>=std) {
				System.out.print(name);
			}
		}
		scanner.close();
	}
}
