import java.util.*;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ������ �Է��Ͻÿ�: ");
		String stc = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(stc, " ");
		
		Vector<String> arr = new Vector<String>();
		
		while(st.hasMoreTokens()) 
			arr.add(st.nextToken());
		
		System.out.println("<�м� ����Դϴ�>");
		
		System.out.println("�ܾ� ����: "+arr.size());
		
		Collections.sort(arr);
		
		ArrayList<String> mul = new ArrayList<String>();
		for(int i=0; i<arr.size()-1; i++) {
			String pre = arr.get(i);
			String nxt = arr.get(i+1);
			if(pre.equals(nxt)) {
				arr.remove(i+1);
				mul.add(pre);
			}
		}
		
		System.out.println("�ܾ� ����: ");
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			if(it.hasNext())
				System.out.print(", ");
		}
		System.out.println();
		
		System.out.println("�ι� �̻� ������ �ܾ�:");
		for(int i=0; i<mul.size(); i++) {
			System.out.print(mul.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("���� ���� ������ ���ĺ�:");
		
		scanner.close();
	}
}

//terrible vessels make the terrible sound.
