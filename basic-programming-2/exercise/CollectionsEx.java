package exercise;
import java.util.*;

public class CollectionsEx {
	static void prinList(LinkedList<String> l) {
		
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if (iterator.hasNext())
				separator = "->";
			else
				separator = "\n";
			System.out.print(e+separator);
		}
	}
	public static void main(String[] args) {
		
	}
}
