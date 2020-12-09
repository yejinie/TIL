
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
		System.out.println("�л� �̸�, �а�, �й�, ��������� �Է��ϼ���.");
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
			System.out.println("�̸�:"+student.getName());
			System.out.println("�а�:"+student.getMajor());
			System.out.println("�й�:"+student.getId());
			System.out.println("�������:"+student.getAvg());
		}
		while(true) {
			System.out.print("�л��̸� >> ");
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
