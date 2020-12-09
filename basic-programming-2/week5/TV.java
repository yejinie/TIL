public class TV {
	String company;
	int year;
	int inch;
	
	public TV(String n, int a, int b) {
		company = n;
		year = a;
		inch = b;
	}
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
	public void show() {
		System.out.println(company + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
