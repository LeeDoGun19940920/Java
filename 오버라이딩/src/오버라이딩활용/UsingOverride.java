package 오버라이딩활용;

class Shape {
	public void draw() { // 생성자에서 draw() 호출 제거됨
		System.out.println("Shape");
	}
}

class Line extends Shape{
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

public class UsingOverride {
	public static void main(String[] args) {
		Shape[] obj = new Shape[4]; // Shape 타입의 배열 선언 및 생성
		int a = 0;

		obj[0] = new Shape();
		obj[1] = new Line();
		obj[2] = new Circle();
		obj[3] = new Rect();

		while(a < 4) { // 배열의 인덱스를 이용한 반복
			obj[a].draw();
			a++;
		}
	}
}