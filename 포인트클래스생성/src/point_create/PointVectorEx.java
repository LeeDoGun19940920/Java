package point_create;

import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) { // 생성자의 지역변수를 통해서 instance variable initialization
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}

public class PointVectorEx {
	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2, 3));
		v.add(new Point(4, 5));
		v.add(new Point(-10, 20));
		
		System.out.println(v.size());
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.elementAt(i));
		}
		
		v.remove(1); // index 1에 대입 된 객체를 삭제
		
		System.out.println();
		System.out.println("객체 삭제 후 Collection에 담긴 객체들 출력");
		
		for(int i = 0; i < v.size(); i++) {
			Point p = v.get(i); // Point class 형인 객체를 변수에 대입
			System.out.println(p);
		}
	}
}
