package 원객체생성;

import java.util.Scanner;

public class Circle01 {
	int radius;
	String name;
	
	/*public Circle01() {
	}
	기본 생성자를 반드시 명시 해주어야 하는 경우 !!!*/ 
	public Circle01() {
	
	}
	
	public Circle01(String n, int r) {
		radius = r;
		name = n;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("각 원에 대한 면적을 구해보세요");
		
		Circle01 c = new Circle01();
		c.radius = scan.nextInt();
		c.name = scan.nextLine();
		
		System.out.printf("현재 %s의 원 면적은 %f 입니다.\n", c.name, c.getArea());
		System.out.println("");
		
		Circle01 c1 = new Circle01("피자피자", 5);
		System.out.printf("현재 %s의 원 면적은 %f 입니다.\n", c1.name, c1.getArea());
		System.out.println("");
		
		Circle01 c2 = new Circle01("자피자피", 10);
		System.out.printf("현재 %s의 원 면적은 %f 입니다.", c2.name, c2.getArea());
		
		scan.close();
	}

}
