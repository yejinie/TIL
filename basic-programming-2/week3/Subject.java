import java.util.Scanner;

public class Subject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String Subject[] = new String[10];
		String Score[] = new String[10];
		
		int i = 0;
		int sum = 0;
		while(true) {
			while(true) {
				System.out.print(">과목명: ");
				String subject = scanner.next();
				if(subject.equals("그만"))
					break;
				Subject[i] = subject;
				
				System.out.print(">과목점수: ");
				String a = scanner.next();
				if(a.equals("그만"))
					break;
				Score[i] = a;
				int score = Integer.parseInt(a);
				sum += score;
				i++;
			}
			
			try {
				int avg = sum/i;
				System.out.println("입력된 과목들의 평균 성적: "+avg);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
				continue;
			}
		}
		
		System.out.println("조회할 과목이름을 입력하세요.");
		while(true) {
			System.out.print(">과목명: ");
			String subject = scanner.next();
			if(subject.equals("그만"))
				break;
	
			for(int j=0; j<=i-1; j++) {
				if(Subject[j].equals(subject)) {
					String score = Score[j];
					System.out.println(subject+"의 점수는 "+score);
				    break;
				}
				else {
					if(j==i-1) {
						System.out.println("해당 과목은 없습니다.");
						break;
					}
					else
						continue;
				}
			}
		}
	    scanner.close();
	}
}
