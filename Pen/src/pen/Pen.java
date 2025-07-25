package pen;

class SharpPencil {
	private int width;
	private int amount;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width = width;
	}
}

class BallPen extends SharpPencil {
	private int amount;
	private String color;
	
	BallPen(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void printColor() {
		System.out.println("잉크 색상은 " + color);
	}
}

class FountainPen extends BallPen {
	private int amount;
	private String color;
	
	FountainPen(String color) {
		super("초록");
		this.color = color;
	}
	public void refil(int n) {
		amount = n;
	}
	void printColor() {
		System.out.println("잉크 색상은 " + color);
	}
	void printAmount() {
		System.out.println("리필 할 잉크 용량은 " + amount + "\n");
	}
}

public class Pen {
	public static void main(String[] args) {
		FountainPen fp = new FountainPen("블루");
		
		System.out.println("만년필에 관한 정보입니다.");
		System.out.println("잉크 색상이 어떻게 되신가요?");
		fp.printColor();
		fp.refil(30);
		System.out.println("리필하실 잉크 용량은 어떻게 되신가요?");
		fp.printAmount();
		
		BallPen bp = new BallPen("빨강");
		
		System.out.println("볼펜에 관한 정보입니다.");
		System.out.println("잉크 색상이 어떻게 되신가요?");
		bp.setColor("노랑");
		System.out.println("볼펜의 색깔은 " + bp.getColor() + " 입니다.");
		bp.setAmount(20);
		System.out.println("볼펜의 용량은 " + bp.getAmount() + " 입니다.\n");
		
		SharpPencil sp = new SharpPencil();
		
		System.out.println("샤프펜슬에 관한 정보입니다.");
		sp.setwidth(5);
		System.out.println("샤프펜슬의 굵기는 " + sp.getwidth() + " 입니다.");
	}
}