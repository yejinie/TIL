
import java.util.*;

class Student {
	private String name, major;
	private int id;
	private double avg;
	public Student(String name, String major, int id, double avg) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public int getId() {
		return id;
	}
	public double getAvg() {
		return avg;
	}
}

public class ch7practice5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> a = new ArrayList<Student>();
		System.out.println("학생 이름, 학과, 학번, 학점평균을 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">> ");
			String name = scanner.next();
			String major = scanner.next();
			int id = scanner.nextInt();
			double avg = scanner.nextDouble();
			Student student = new Student(name, major, id, avg);
			a.add(student);
		}
		Iterator<Student> it = a.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.println("--------------------");
			System.out.println("이름:"+student.getName());
			System.out.println("학과:"+student.getMajor());
			System.out.println("학번:"+student.getId());
			System.out.println("학점평균:"+student.getAvg());
		}
		while(true) {
			System.out.print("학생이름 >> ");
			Iterator<Student> itr = a.iterator();
			while(itr.hasNext()) {
				String name = it.next().getName();
				if(name.equals(scanner.next())) {
					System.out.println(name+", ");
				}
			}
		}
		
		
		scanner.close();
	}
}
