
public class ch3practice13 {
	public static void main(String[] args) {
		String str[] = {"¹Ú¼ö Â¦", "¹Ú¼ö Â¦Â¦"};
		int res, num, numOf369 = 0;
		for(int i=1; i<100; i++) {
			num = i;
			for(res = num%10; num>0; res = num%10) {
				if(res==3 || res==6 || res==9)
					numOf369++;
				num = num/10;
			}
			if(numOf369>0)
				System.out.println(i + str[numOf369-1]);
			numOf369=0;
		}
	}
}