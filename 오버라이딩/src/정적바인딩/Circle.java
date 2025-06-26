package 정적바인딩;

class Shape {
	protected String name;
	public void paint() {
		draw(); // paint 메소드 호출시 draw 메소드 호출.
	}
	void draw() {
		System.out.println(name);
	}
}

public class Circle extends Shape {
	protected String name;
	void draw() {
		name = "Circle";
		super.name = "Shape"; // Shape 클래스 필드 초기화.
		super.draw();
		System.out.println(this.name);
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
	}

}
