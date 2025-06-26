package methodOverloading;
import java.util.Scanner;

public class MethodOverloading_01 {
	int x, y;
	
	// 객체 생성자
	public MethodOverloading_01() {
		// 기존 클래스를 바탕으로 객체 생성 시키는 목적이 있을 뿐, 값 반환의 기능은 없다.
		// 객체의 속성값을 설정 하는 것은 값 반환이 아니다.
	}
	// 객체가 가지는 기능
	public int getSum(int i, int j) {
		// 메소드 내에서 사용 되는 변수를 지역 변수라고 한다.
		return i + j;
	}
	
	public int getSum(int i, int j, int s) {
		return i + j + s;
		
	}
	
	public String toString() {
		return x + " " + y;
	}
	
	public String toString(int t, int y) {
		return "문자열로 인식된 값입니다. "
				+ t + " " + y;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		MethodOverloading_01 M = new MethodOverloading_01();
		
		System.out.println("첫번째 함수에 값 입력");
		M.x = M.getSum(scan.nextInt(), scan.nextInt());
		// 메소드 호출하는 메소드에 {} 없는 이유는 기존에 설정된 결과를 불러오는 것이지, 결과를 생성하는 곳이 아니므로

		System.out.println("두번째 함수에 값 입력");
		M.y = M.getSum(scan.nextInt(), scan.nextInt(), scan.nextInt());
				
		System.out.println(M.toString());
		System.out.println(M.toString(1, 2));
	}
}
