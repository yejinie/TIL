package week9;
import java.util.*;

public class HW9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<String> v;
		v = new Vector<String>();
		
		System.out.println("�Ӵ��� �Է��Ͻÿ�:"); //�Է� �� ctrl+z
		
		while(true) {
			v.add(scanner.next());
			if(scanner.hasNext())
				continue;
			else {
				scanner.close();
				break;
			}
		}
		
		System.out.println("�ܾ� ����: "+v.size());
		
		Collections.sort(v);
		
		System.out.println("���ĵ� ��ū:");
		int i=0;
		while(true) {
			System.out.print(v.get(i));
			i++;
			if(i>v.size()-1)
				break;
			else {
				System.out.print(", ");
			}
		}
	}
}

//Empty vessels make the most sound. �Է� �� 
//ctrl+z
//������ �ü���� �´� EOF �Է� ���