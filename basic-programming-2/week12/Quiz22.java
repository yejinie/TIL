package quiz;
import java.util.*;
import java.io.*;

class Score {
	private int score;
	private int grade;
	
	public Score(int score) {
		this.score = score;
	}
	public void Grade() {
		
	}
	public int getScore() {
		return score;
	}
	public int getGrade() {
		return grade;
	}
}

public class Quiz22 {
	public static void main(String[] args) {
		HashMap<String, Score> map = new HashMap<String, Score>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Java 성적 파일 이름을 입력하세요:");
		String src = scanner.next();
		FileReader fin = null;
		try {
			fin = new FileReader(src);
			int c;
			String name = null;
			char num;
			
			while((c = fin.read())!=-1) {
				for(int i=0; i<3; i++) {
					name += (char)(fin.read());
				}
				//while(fin.read() != "\n") {
					//num += (char)(fin.read());
					//Score score = new Score(score);
					
				//}
				//map.put(name, Score);
			}
		}
		catch (IOException e) {
			System.out.println("오류가 발생했습니다.");
		}
		
		while(true) {
			System.out.print("학생의 이름을 입력하세요: ");
			String name = scanner.next();
			if(name.equals("그만")) 
				break;
			Score score = map.get(name);
			System.out.println(name+" "+score.getScore()+" "+score.getGrade());
		}
		
		FileWriter fout = null;
		try {
			fout = new FileWriter("java2.txt");
			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String name = it.next();
				
			}
		}
		catch (IOException e) {
			System.out.println("오류가 발생했습니다.");
		}
	
		scanner.close();
	}
}
