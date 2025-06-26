package 배열형객체;

class Circle {
	int radius;
	Circle(int t) {
		this.radius = t;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class CircleArray {
	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		// int i; duplicate local variable!
		for(int i = 0; i < c.length; i++) { // 실질적인 값을 넣는 Circle 객체 생성
			c[i] = new Circle(i);
		}
		
		for(int i = 0; i < c.length; i++) {
			System.out.println((int)c[i].getArea());
		}
	}
}
