package static_member;

public class StaticSample {
	int n = 10;
	void g() {
		
	}
	
	static int m = 20;
	static void f() {
		
	}
	
	public static void main(String[] args) {
		System.out.println(m); // field m은 static 이므로 별도의 객체화를 안해도 된다.
		
		StaticSample SS = new StaticSample();
		System.out.println(SS.n);
		
	}
}