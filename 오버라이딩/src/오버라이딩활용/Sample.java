package 오버라이딩활용;

class SuperObject {
	public void paint() {
		draw();
	}
	
	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject {
	public void paint() {
		super.draw();
	}
	
	public void draw() {
		System.out.println("Sub Object");
	}
}

public class Sample {
	public static void main(String[] args) {
		SuperObject b = new SuperObject();
		b.draw();
	}

}
