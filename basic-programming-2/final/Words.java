import java.util.*;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("영어 문장을 입력하시오: ");
		String stc = scanner.nextLine();
		
		StringTokenizer st = new StringTokenizer(stc, " ");
		
		Vector<String> arr = new Vector<String>();
		
		while(st.hasMoreTokens()) 
			arr.add(st.nextToken());
		
		System.out.println("<분석 결과입니다>");
		
		System.out.println("단어 개수: "+arr.size());
		
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
		
		System.out.println("단어 정렬: ");
		Iterator<String> it = arr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
			if(it.hasNext())
				System.out.print(", ");
		}
		System.out.println();
		
		System.out.println("두번 이상 등장한 단어:");
		for(int i=0; i<mul.size(); i++) {
			System.out.print(mul.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("가장 많이 등장한 알파벳:");
		
		scanner.close();
	}
}

//terrible vessels make the terrible sound.
