
class Rectangle {
	int x, y, width, height;
	public Rectangle(int a, int b, int c, int d) {
		this.x = a; this.y = b; this.width = c; this.height = d;
	}
	public int square() {
		//사각형 넓이 리턴
		return width*height;
	}
	public void show() {
		//사각형의 좌표와 넓이를 출력
		System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
	}
	public boolean contains(Rectangle r) {
		//매개변수 r이 현 사각형 안에 있는지 리턴
		//t안에 r이 들어가는지
		if(r.x>x && r.x<x+width && r.y>y && r.y<y+height) {
			if(r.x+r.width>x && r.x+r.width<x+width && r.y+r.height>y && r.y+r.height<y+height)
				return true;
			else
				return false;
		}
		else
			return false;
	}
}

public class ch4practice4 {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 "+s.square());
		if(t.contains(r)) System.out.println("t는 r을 포합합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포합합니다.");
		else
			System.out.println("t는 s을 포함하지 않습니다.");
	}

}
