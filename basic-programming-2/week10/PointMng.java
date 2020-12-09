package assignment; //#HW10 60201658 강예진
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
			System.out.print("이름과 구매금액 입력>> ");
			String name = scanner.next();
			if(name.equals("그만")) 
				break;
			
			int purch = scanner.nextInt();

			if(m.containsKey(name)) {
				Point point = m.get(name); //이름에 해당하는 Point객체 검색
				point.add(purch);
			}
			else 
				m.put(name, new Point(purch));
			
			printList(m); //모든 고객 출력
			System.out.println();
		}
	}
	static void menu3(HashMap<String, Point> m) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름>> ");
		String name = scanner.next();
		System.out.print("상품가격>> ");
		int price = scanner.nextInt();
		
		Point point = m.get(name);
		int nowp = point.getPoint();
		
		if(nowp==0) System.out.println("차감할 포인트가 없습니다.\n"
					+ "실지불액: "+price);
		
		else if(nowp>=price) {
			point.ded(price);
			System.out.println("실지불액: 0");
			System.out.println("잔여포인트: "+point.getPoint());
		}
		else {
			int due = price-nowp;
			point.ded(nowp);
			System.out.println("실지불액: "+due);
			System.out.println("잔여포인트: 0");
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
		System.out.println("최우수 고객>>"+vip);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//해시맵 생성
		HashMap<String, Point> map = new HashMap<String, Point>();
		
		while(true) {
			System.out.println("**포인트 관리 프로그램입니다**\n"
					+ "**1.포인트 적립\n"
					+ "**2.포인트 조회\n"
					+ "**3.포인트 차감\n"
					+ "**4.최우수 고객 알림\n"
					+ "**5.종료");
			
			System.out.print("**선택: ");
			int menu = scanner.nextInt();
			
			if(menu==1) menu1(map); 
			
			else if(menu==2) {
				System.out.print("이름>> ");
				String name = scanner.next();
				Point point = map.get(name);
				System.out.println("포인트: "+point.getPoint());
			}
			else if(menu==3) menu3(map);

			else if(menu==4) menu4(map);
			
			else if(menu==5) {
				System.out.println("MJ포인트 관리 프로그램 정상 종료");
				break;
			}
			else System.out.println("없는 메뉴입니다.");
		}	
		scanner.close();
	}
}
