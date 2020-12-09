package week11;
import java.util.*;
import java.io.*;

public class HW11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		File src1 = new File(scanner.next());
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		File src2 = new File(scanner.next());
		System.out.print("�պ��� ���� �̸��� �Է��ϼ���>>");
		File dest = new File(scanner.next());
		
		int c;
		try {
			FileReader fr1 = new FileReader(src1);
			FileReader fr2 = new FileReader(src2);
			FileWriter fw = new FileWriter(dest, true);
			
			while((c = fr1.read())!=-1) {
				fw.write((char)c);
			}
			
			while((c = fr2.read())!=-1) {
				fw.write((char)c);
			}
			
			fr1.close();
			fr2.close();
			fw.close();
			System.out.println("������Ʈ ���� �ؿ�"+dest+"���Ͽ� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� �պ� ����");
		}
		scanner.close();
	}
}
