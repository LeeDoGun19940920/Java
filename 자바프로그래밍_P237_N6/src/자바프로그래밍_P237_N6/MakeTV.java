package 자바프로그래밍_P237_N6;

class TV{
	private int size;
	private String manufacturer;
	public TV() { // 객체생성1
		size = 32;
		manufacturer = "LG";
	}
	
	public TV(String manufacturer) { // 객체생성2
		size = 32;
		this.manufacturer = manufacturer; // public TV(String manufacturer) 객체의 필드 초기화
	}
	
	public TV(int size, String manufacturer) {
		this.size = size;
		this.manufacturer = manufacturer;
	}
	
	void print() {
		System.out.println(this.size + "인치 " + this.manufacturer);
	}
}

public class MakeTV {
	public static void main(String[] args) {
		TV tv = new TV(); // 새로운 객체 생성
		tv.print();
		
		TV tv1 = new TV("삼성"); // 새로운 객체 생성
		tv1.print();
		
		TV tv2 = new TV(65, "삼성"); // 새로운 객체 생성
		tv2.print();
	}
}