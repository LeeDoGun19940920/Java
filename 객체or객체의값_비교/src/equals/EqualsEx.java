package equals;

class Point {
	private int x, y; // Point class 내부에서만 호출이 가능.
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Object obj) { // 객체 주소값이 같은지를 비교하는 것이 아닌, 
										// 객체의 내용물이 같은지를 비교하기 위해 오버라이딩 해주어야 한다.
		Point p = (Point)obj;
		
		if(x == p.x && y == p.y) {
			return true;
		} else return false;
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = new Point(4, 5);
		
		if(a == b) {
			System.out.println("true");
		} else System.out.println("false");
		if(b == c) {
			System.out.println("true");
		} else System.out.println("false");
		if(a.equals(b)) {
			System.out.println("true");
		} else System.out.println("false");
		if(b.equals(c)) {
			System.out.println("true");
		} else System.out.println("false");
	}
}
