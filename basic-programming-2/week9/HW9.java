package week9;
import java.util.*;

public class HW9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<String> v;
		v = new Vector<String>();
		
		System.out.println("속담을 입력하시오:"); //입력 후 ctrl+z
		
		while(true) {
			v.add(scanner.next());
			if(scanner.hasNext())
				continue;
			else {
				scanner.close();
				break;
			}
		}
		
		System.out.println("단어 개수: "+v.size());
		
		Collections.sort(v);
		
		System.out.println("정렬된 토큰:");
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

//Empty vessels make the most sound. 입력 후 
//ctrl+z
//윈도우 운영체제에 맞는 EOF 입력 방식