package 자바프로그래밍_P240_N13;

class Test1 {
	public static int f(int a, int b) {
		return a + b; 
	}
	
}

public class Test {
	public static void main(String[] args) {
		
		int sum = Test1.f(2,4);
		System.out.println(sum);
	}

}
