package inherit;

class Point {
	private int x,y; // private로 선언 되었기에 해당 클래스 내에서만 접근이 가능하다.
	
	// instance 변수에 저장하기 위한 메소드 생성
	public void set(int x, int y) {
		this.x = x; // Point 클래스를 이용해서 생성 된 객체의 instance 변수 x를 표현 하기위해 this 키워드 사용
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

// Point 클래스를 상속하는 ColorPoint 클래스 작성
class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		set(3,5);
		System.out.println(color);
		this.showPoint();
		// Point 클래스를 상속하고 있기에 별도의 showPoint 메소드 정의 없이 호출할 수 있다.
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.setColor("노란색");
		cp.showColorPoint();
	}
}
