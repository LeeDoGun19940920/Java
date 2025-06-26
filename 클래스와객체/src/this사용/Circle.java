package this사용;

public class Circle {
	int radius;
	
	/*
	Circle 클래스의 Constructor를 작성. Parameter의 이름과 field의 이름이 같으므로
	this를 사용해서 구분 해준다.
	*/
	public Circle(int radius) {
		this.radius = radius; 
	/* this.radius는 public Circle(int radius) 객체의 field "radius"라는 의미이다. 
		this.radius == 이 객체의 radius */
	}
	
	public static void main(String[] args) {
		Circle c = new Circle(1);
		Circle c1 = new Circle(2);
		
		System.out.println(c.radius);
		System.out.println(c1.radius);
		System.out.println("=====================");
		
		Circle s = c;
		c1 = s;
		// 간단히 말해서, 레퍼런스 변수에 담기는 주소값을 바꿔줌으로써 다른 객체를 참조하게 만들어 준다.
		System.out.println(c1.radius);
	}
}
