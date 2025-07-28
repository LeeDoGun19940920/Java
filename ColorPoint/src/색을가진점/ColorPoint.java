package 색을가진점;

class Point {
	private int x, y; // Point class 내부에서만 사용되어야 한다.
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class ColorPoint extends Point {
	String color;
	String setColor;
	
	// Method getX 와 getY 사용 Point class의 field 값 사용;
	public ColorPoint() {
		super(0, 0);
		color = "Black";
		setColor = "("+ getX() + ", " + getY() + ")";
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
	}
	
	void setXY(int x, int y) { // cp.setXY(10, 20)의 안자를 받는 메소드
		setColor ="("+ x + ", " + y + ")";;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return color + "색의 " + setColor +"의 점입니다.";
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str);
		
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString());
		
		ColorPoint cp1 = new ColorPoint(10, 10);
		cp1.setXY(5, 5);
		cp1.setColor("RED");
		System.out.println(cp1.toString() + "입니다.");
	}
}
