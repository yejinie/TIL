
import java.util.*;

public class ch7practice2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		ArrayList<String> a = new ArrayList<String>(6);
		for(int i=0; i<6; i++) {
			a.add(scanner.next());
		}
		double sum = 0;
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {
			String n = it.next();
			if(n.equals("A")) {
				sum += 4.0;
			}
			else if(n.equals("B")) {
				sum += 3.0;
			}
			else if(n.equals("C")) {
				sum += 2.0;
			}
			else if(n.equals("D")) {
				sum += 1.0;
			}
			else if(n.equals("F")) {
				sum += 0.0;
			}
		}
		System.out.println(sum/a.size());
	}
}
