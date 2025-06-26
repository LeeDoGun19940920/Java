package 추상부모클래스;

abstract class Shape {
	abstract protected void draw(); // abstract 메소드는 자체적으로 실사용이 불가능하다
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line 객체입니다.");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect 객체입니다.");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle 객체입니다.");
	}
}

public class Diagram {
	public static void main(String[] args) {
		Shape s = new Line();
		s.draw();
		Rect r = new Rect();
		r.draw();
		Circle c = new Circle();
		c.draw();
	}

}
