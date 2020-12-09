
public class ch3practice10 {
	public static void main(String[] args) {
		int intArray [][] = new int [4][4];
		int i,p,q;
		for(int num = 0; num<10; num++) {
			i = (int)(Math.random()*10 + 1);
			p = (int)(Math.random()*4 + 1);
			q = (int)(Math.random()*4 + 1);
			if(intArray [p-1][q-1] == 0)
				intArray [p-1][q-1] = i;
			else
				num--;
		}
		for(int a=0; a<4; a++) {
			for(int b=0; b<4; b++)
				System.out.print(intArray [a][b] + "\t");
			System.out.println();
		}
	}	
}