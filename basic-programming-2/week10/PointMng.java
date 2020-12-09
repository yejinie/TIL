package assignment; //#HW10 60201658 ������
import java.util.*;

class Point {
	private int point;
	public Point(int purch) {
		this.point = purch/10;
	}
	public void add(int purch) {
		this.point += purch/10;
	}
	public void ded(int price) {
		this.point -= price;
	}
	public int getPoint() {
		return this.point;
	}
}


public class PointMng {
	static void printList(HashMap<String, Point> m) {
		Set<String> keys = m.keySet();
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			Point point = m.get(name);
			System.out.print("("+name+", "+point.getPoint()+") ");
		}
	}
	
	static void menu1(HashMap<String, Point> m) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�̸��� ���űݾ� �Է�>> ");
			String name = scanner.next();
			if(name.equals("�׸�")) 
				break;
			
			int purch = scanner.nextInt();

			if(m.containsKey(name)) {
				Point point = m.get(name); //�̸��� �ش��ϴ� Point��ü �˻�
				point.add(purch);
			}
			else 
				m.put(name, new Point(purch));
			
			printList(m); //��� �� ���
			System.out.println();
		}
	}
	static void menu3(HashMap<String, Point> m) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�̸�>> ");
		String name = scanner.next();
		System.out.print("��ǰ����>> ");
		int price = scanner.nextInt();
		
		Point point = m.get(name);
		int nowp = point.getPoint();
		
		if(nowp==0) System.out.println("������ ����Ʈ�� �����ϴ�.\n"
					+ "�����Ҿ�: "+price);
		
		else if(nowp>=price) {
			point.ded(price);
			System.out.println("�����Ҿ�: 0");
			System.out.println("�ܿ�����Ʈ: "+point.getPoint());
		}
		else {
			int due = price-nowp;
			point.ded(nowp);
			System.out.println("�����Ҿ�: "+due);
			System.out.println("�ܿ�����Ʈ: 0");
		}
	}
	static void menu4(HashMap<String, Point> m) {
		Set<String> keys = m.keySet();
		Iterator<String> it = keys.iterator();
		
		int max = 0;
		String vip = null;
		
		while(it.hasNext()) {
			String name = it.next();
			Point point = m.get(name);
			int value = point.getPoint();
			if(value>max) {
				max = value; vip = name;}
			else if(value==max) vip = vip+", "+name;
		}
		System.out.println("�ֿ�� ��>>"+vip);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//�ؽø� ����
		HashMap<String, Point> map = new HashMap<String, Point>();
		
		while(true) {
			System.out.println("**����Ʈ ���� ���α׷��Դϴ�**\n"
					+ "**1.����Ʈ ����\n"
					+ "**2.����Ʈ ��ȸ\n"
					+ "**3.����Ʈ ����\n"
					+ "**4.�ֿ�� �� �˸�\n"
					+ "**5.����");
			
			System.out.print("**����: ");
			int menu = scanner.nextInt();
			
			if(menu==1) menu1(map); 
			
			else if(menu==2) {
				System.out.print("�̸�>> ");
				String name = scanner.next();
				Point point = map.get(name);
				System.out.println("����Ʈ: "+point.getPoint());
			}
			else if(menu==3) menu3(map);

			else if(menu==4) menu4(map);
			
			else if(menu==5) {
				System.out.println("MJ����Ʈ ���� ���α׷� ���� ����");
				break;
			}
			else System.out.println("���� �޴��Դϴ�.");
		}	
		scanner.close();
	}
}
