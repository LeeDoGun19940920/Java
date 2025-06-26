package this사용;

public class ConstructorExample {
	int x;
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public ConstructorExample() {
		this.x = x;
	}
	
	public static void main(String[] args) {
		ConstructorExample a = new ConstructorExample();
		// 생성자 호출을 이용한 객체 생성
		int n = a.getX();
	}
}
