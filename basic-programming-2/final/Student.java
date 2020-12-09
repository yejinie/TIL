import java.util.*;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Double> map = new HashMap<String, Double>();
		System.out.println("���� ���б� ���� �ý����Դϴ�. �̸��� ������ �Է��ϼ���.");
		while(true) {
			System.out.print("�̸��� ����>> ");
			String str = scanner.next();
			if(str.equals("�׸�")) break;
			else {
				String name = str;
				double score = scanner.nextDouble();
				map.put(name, score);
			}
		}
		System.out.print("���л� ���� ������ �Է��ϼ���>> ");
		double std = scanner.nextDouble();
		
		System.out.print("���л� ���: ");
		
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
