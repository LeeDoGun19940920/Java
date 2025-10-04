package myPoint;

public class MyPoint {
	int a, b = 0;
	
	MyPoint(int a, int b){
		this.a = a;
		this.b = b;
		
		System.out.println(a + "와 " + b + "에 관한 " + "객체 생성이 되었습니다.");
	}
	
	public String toString() {
		return "Point(" + a + "," + b + ")";
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		
		if(p.equals(q)) {
			System.out.print("같은 점");
		}
		else {
			System.out.print("다른 점");
		}
	}
}
