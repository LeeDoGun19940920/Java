package 원객체생성;

public class Circle {
	int radius;
	String name;
	// instance화 이후에 대입되는 값들로 초기화
	
	public Circle() {
		// constructor
		// field 초기화 해줘야 될 필요가 없다.
	}
	
	public double getArea() {
		// instance화가 일어나면서 메소드를 실제로 실행 할 수 있게 된다.
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "피자피자"; 
		// Circle 클래스의 필드(멤버 변수) 초기화
		double area1 = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area1 + "\n");
		
		Circle donut = new Circle();
		donut.radius = 5;
		donut.name = "도넛도넛";
		double area2 = donut.getArea();
		System.out.println(pizza.name + "의 면적은" + area2);
	}
}
