package 객체라이프타임;

public class GarbageEx {
	
	public static void main(String[] args) {
		String a = new String("Good");
		String b = new String("Bad");
		String c = new String("Girl");
		// String 클래스 코드가 이미 존재하기에, main 함수에 객체 생성자 호출만 작성을 해도 실행이 가능하다.
		b = a;
		c = null;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// String("Bad") 객체는 garbage가 된다.
	}
}
