package 오버라이딩;


class Shape {
	/*public Shape next;
	public Shape() { // Shape 클래스 생성자. method 와는 다른 개념
		next = null; }*/
	public void draw() {
		System.out.println("Shape");
		}
}

class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) { // 지역변수 p에 담기는 주소값을 Shape 타입으로 upcasting
		p.draw(); // 
	}
	public static void main(String[] args) {
		Line line = new Line();
		
		paint(line); 
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}