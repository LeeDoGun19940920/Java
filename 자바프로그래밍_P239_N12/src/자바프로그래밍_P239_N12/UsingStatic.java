package 자바프로그래밍_P239_N12;

class StaticSample {
	public int x;
	public static int y;
	public static int f() { return y; }
}

public class UsingStatic {
	public static void main(String[] args) {
		
		StaticSample.y = 10;
		/*int tmp = StaticSample.f();
		System.out.println(tmp);*/
		
		StaticSample a = new StaticSample();
		int tmp = a.y;
		System.out.println(tmp);
	}

}
