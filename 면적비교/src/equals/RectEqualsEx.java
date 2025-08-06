package equals;

class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class Rect1 {
	private int width;
	private int height;
	
	public Rect1(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		Rect1 r = (Rect1)obj;
		
		if(width == r.width && height == r.height) {
			return true;
		} else return false;
	}
}

public class RectEqualsEx {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(2, 3);
		Rect c = new Rect(4, 5);
		
		if(a.equals(b)) {
			System.out.println(true);
		} else System.out.println(false);
		
		if(b.equals(c)) {
			System.out.println(true);
		} else System.out.println(false);
		
		Rect1 d = new Rect1(2, 3);
		Rect1 e = new Rect1(2, 3);
		Rect1 f = new Rect1(4, 5);
		
		if(d.equals(e)) {
			System.out.println(true);
		} else System.out.println(false);
		
		if(e.equals(f)) {
			System.out.println(true);
		} else System.out.println(false);
	}
}
