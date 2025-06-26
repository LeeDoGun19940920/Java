package methodOverloading;
import java.util.Scanner;

// method overloading을 이용해서 여러 객체 생성
public class MethodOverloading {
	int i, j;
	
	public MethodOverloading() {
		i = 1;
		j = 2;
	}
	
	public MethodOverloading(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	int getSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정해진 값으로 결과가 나오는 객체");
		MethodOverloading M = new MethodOverloading();
		System.out.println(M.i + M.j + "\n");
		
		System.out.println("원하는 값을 넣을 수 있는 객체");
		MethodOverloading M1 = new MethodOverloading(scan.nextInt(), scan.nextInt());
		System.out.println(M1.getSum(M1.i, M1.j) + "\n");
		
		System.out.println("parameter에 차이를 줌으로써 서로 다른 생성자로 만들 수 있다.");
	}

}
