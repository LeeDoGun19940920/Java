package toString;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toSring() { // toString()는 Object 클래스에 정의 된 거지만, 현 클래스에 재정의 되었다.
		return "Point(" + x + "," + y + ")";
	}
}

public class ToStringEx {
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p.toString());
		System.out.println(p);
		System.out.println(p + "입니다.");
	}

}
