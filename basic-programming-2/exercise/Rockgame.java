
import java.util.Scanner;

public class Rockgame {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String cvar;
		String yvar;
		
	    System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.print("ö�� >>");
		cvar = scanner.next();
		System.out.print("���� >>");
		yvar = scanner.next();
		
		if (cvar.equals("�ָ�")) 
			if (yvar.equals("�ָ�"))
				System.out.println("�����ϴ�");
			else if (yvar.equals("����"))
				System.out.println("ö���� �̰���ϴ�");
			else
				System.out.println("���� �̰���ϴ�");
		
		else if (cvar.equals("����"))
			if (yvar.equals("�ָ�"))
				System.out.println("���� �̰���ϴ�");
			else if (yvar.equals("����"))
				System.out.println("�����ϴ�");
			else
				System.out.println("ö���� �̰���ϴ�");
		
		else
			if (yvar.equals("�ָ�"))
				System.out.println("ö���� �̰���ϴ�");
			else if (yvar.equals("����"))
				System.out.println("���� �̰���ϴ�");
			else
				System.out.println("�����ϴ�");
		
		scanner.close();
	}
}
