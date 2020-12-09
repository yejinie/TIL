
		//1부터 99까지 중에 홀수의 짝을 구하는 문제

public class ch3practice1_for {
	public static void main(String[] args) {
		int sum=0;
		for(int i=0; i<100; i += 2) {
			sum += i;
		}
		System.out.println(sum);
	}
}



