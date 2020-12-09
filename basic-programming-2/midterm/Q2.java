package week8;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int num = 0;
		System.out.print("3x3 정사각형 행렬을 입력하세요: ");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				num = scanner.nextInt();
				arr[i][j] = num;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		int last = 0;
		int sum = 0;
		
		for(int j=0; j<arr[0].length; j++) {
			sum += arr[0][j];
		}

		
		last = sum;
		sum = 0;
		System.out.println(last);
		for(int j=0; j<arr.length; sum=0, j++) {
			for(int i=0;i<arr.length; i++) {
				sum += arr[i][j];
			}
			if(sum==last) {
				last = sum;
				continue;
			}
			else {
				System.out.println("미방진이 아닙니다.");
				break;
			}
		}
		
	
		sum = 0;
		for(int i=0; i<arr.length; sum=0,i++) {
		    sum += arr[i][i];
		    if(sum==last)
				last = sum;
			else {
				System.out.println("미방진이 아닙니다.");
				break;
			}
		}
		
		sum=0;
		sum += arr[2][0];
		sum += arr[1][1];
		sum += arr[0][2];
		if(sum==last)
			System.out.println("미방진입니다.");
		scanner.close();
	}
}
