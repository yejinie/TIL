package week8;

class Box {
	private double width, length, height, volume;
	private static int boxes = 0;
	public Box() {
		width = 10; length = 10; height = 10;
		boxes++;
	}
	public Box(double width, double length, double height) {
		this.width = width; 
		boxes++;
	}
	public static int getBoxes() {
		return boxes;
	}
	public double getVolume() {
		volume = width*length*height;
		return volume;
	}
}


public class BoxTest {
	public static void main(String[] args) {
		Box b1 = new Box(1,2,3);
		Box b2 = new Box(1,2,3);
		Box b3 = new Box(1,2,3);
		System.out.println(b1.getVolume()+", "+b2.getVolume()+", "+b3.getVolume());
		System.out.println("객채가 "+Box.getBoxes()+"개 생성되었다.");

	}

}
