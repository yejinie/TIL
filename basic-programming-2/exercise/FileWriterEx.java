
import java.util.*;
import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		int c;	//�̰� �� �ִ� �ɱ�....???
		try {
			fout = new FileWriter("c:\\Temp\\Fox.txt", true);
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0)
					break;
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		}
		catch (IOException e) {
			System.out.println("����� ����");
		}
		scanner.close();
	}
}
