package practicehello;

public class Hello {
	
	public static int sum(int n, int m) {
		return n + m;
	}
	
	public static void main(String[] args) {
		int i = 20;
		int s;
		char a;
		
		s= sum(i, 10);
		a = '?'; // 문장의 마지막에 ';' 을 붙힘으로써, 문장의 끝임을 알려주는 방법;
		
		System.out.println(a);
		System.out.println("Hello");
		System.out.println(s);

		System.out.printf("("+3+","+5+")");
	}
}
