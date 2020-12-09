

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a+"의 길이는 "+a.length());
		System.out.println(a.contains("#"));	//#을 포함하는지 boolean
		
		a = a.concat(b);	//문자열 합치기
		System.out.println(a);
		
		a = a.trim();	//앞뒤 공백 제거
		System.out.println(a);
		
		a = a.replace("C#","Java");	//replace
		System.out.println(a);
		
		String s[] = a.split(",");	//regex에 일치하는 부분 중심으로 분리
		for(int i=0; i<s.length; i++) 
			System.out.println("분리된 문자열"+i+": "+s[i]);
		
		a = a.substring(5);	//인덱스 5부터 끝까지 리턴
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);
	}
}
