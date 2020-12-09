
import java.util.Scanner;

public class Rockgame {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String cvar;
		String yvar;
		
	    System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >>");
		cvar = scanner.next();
		System.out.print("영희 >>");
		yvar = scanner.next();
		
		if (cvar.equals("주먹")) 
			if (yvar.equals("주먹"))
				System.out.println("비겼습니다");
			else if (yvar.equals("가위"))
				System.out.println("철수가 이겼습니다");
			else
				System.out.println("영희가 이겼습니다");
		
		else if (cvar.equals("가위"))
			if (yvar.equals("주먹"))
				System.out.println("영희가 이겼습니다");
			else if (yvar.equals("가위"))
				System.out.println("비겼습니다");
			else
				System.out.println("철수가 이겼습니다");
		
		else
			if (yvar.equals("주먹"))
				System.out.println("철수가 이겼습니다");
			else if (yvar.equals("가위"))
				System.out.println("영희가 이겼습니다");
			else
				System.out.println("비겼습니다");
		
		scanner.close();
	}
}
