package week11;
import java.util.*;
import java.io.*;

public class HW11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		File src1 = new File(scanner.next());
		System.out.print("두번째 파일 이름을 입력하세요>>");
		File src2 = new File(scanner.next());
		System.out.print("합병할 파일 이름을 입력하세요>>");
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
			System.out.println("프로젝트 폴더 밑에"+dest+"파일에 저장하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 합병 오류");
		}
		scanner.close();
	}
}
