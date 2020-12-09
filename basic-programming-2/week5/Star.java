import java.util.Scanner;

public class Star {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = {0,0,0,0,0,0,0,0,0,0};
		System.out.println("숫자를 10개 입력하세요");
		for(int i=0; i<10; i++) {
			String number = scanner.next();
			
			if (number.length()==1) {
				array[0] = array[0]+1;
			}
			else {
				for(int j=1; j<10; j++) {
					int REDIX = 10;
					char chj = Character.forDigit(j, REDIX);

					if (number.charAt(0) == chj) {
						array[j]=array[j]+1;
						break;
					}
					else
						continue;
				}
			}
		}

		int j= 0;
		for(int i=0; i<10; i++) {
			System.out.print(i*10 + "~" + (i*10 +9) + ":");
			for(j=array[i]; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		scanner.close();
	}
}
