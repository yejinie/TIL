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
				System.out.print(">�����: ");
				String subject = scanner.next();
				if(subject.equals("�׸�"))
					break;
				Subject[i] = subject;
				
				System.out.print(">��������: ");
				String a = scanner.next();
				if(a.equals("�׸�"))
					break;
				Score[i] = a;
				int score = Integer.parseInt(a);
				sum += score;
				i++;
			}
			
			try {
				int avg = sum/i;
				System.out.println("�Էµ� ������� ��� ����: "+avg);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");
				continue;
			}
		}
		
		System.out.println("��ȸ�� �����̸��� �Է��ϼ���.");
		while(true) {
			System.out.print(">�����: ");
			String subject = scanner.next();
			if(subject.equals("�׸�"))
				break;
	
			for(int j=0; j<=i-1; j++) {
				if(Subject[j].equals(subject)) {
					String score = Score[j];
					System.out.println(subject+"�� ������ "+score);
				    break;
				}
				else {
					if(j==i-1) {
						System.out.println("�ش� ������ �����ϴ�.");
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
