public class TV {
	String company;
	int year;
	int inch;
	
	public TV(String n, int a, int b) {
		this.company = n;
		this.year = a;
		this.inch = b;
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
	public void show() {
		System.out.println(company + "���� ���� " + year + "���� " + inch + "��ġ TV");
	}
}
