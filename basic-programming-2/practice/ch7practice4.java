
import java.util.*;

public class ch7practice4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		while(true) {
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int num = scanner.nextInt();
			if(num==0)
				break;
			v.add(num);
			
			int sum = 0;
			Iterator<Integer> it = v.iterator();
			while(it.hasNext()) {
				int vnum = it.next();
				System.out.print(vnum+" ");
				sum += vnum;
			}
			System.out.println();
			System.out.println("���� ��� "+sum/v.size());
		}

	}

}
