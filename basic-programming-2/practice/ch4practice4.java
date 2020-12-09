
class Rectangle {
	int x, y, width, height;
	public Rectangle(int a, int b, int c, int d) {
		this.x = a; this.y = b; this.width = c; this.height = d;
	}
	public int square() {
		//�簢�� ���� ����
		return width*height;
	}
	public void show() {
		//�簢���� ��ǥ�� ���̸� ���
		System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"x"+height+"�� �簢��");
	}
	public boolean contains(Rectangle r) {
		//�Ű����� r�� �� �簢�� �ȿ� �ִ��� ����
		//t�ȿ� r�� ������
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
		System.out.println("s�� ������ "+s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
		else
			System.out.println("t�� s�� �������� �ʽ��ϴ�.");
	}

}
