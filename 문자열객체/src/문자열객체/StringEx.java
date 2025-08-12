package 문자열객체;

public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b); // a에 대입된 객체 뒤에 b에 대입된 객체 연결
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a);
		
		a = a.replace("C#", "Java"); // replace == 대체하다. replacement == 대체
		System.out.println(a);
		
		String[] s = a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println("분리된 문자열" + i +":" + s[i]);
		}
		
		a = a.substring(5); // 인덱스 5부터 하위 문자열 대입
		System.out.println(a);
				
		char c = a.charAt(2);
		System.out.println(c);
		
		System.out.println("자바"+3.14+false+'a');
	}

}
