package homeAppliance;

class TV {
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	int pixel;
	
	public ColorTV(int size, int pixel) {
		super(size);
		this.pixel = pixel;
	}
	
	void printProperty() {
		System.out.println(getSize() + "인치 " + pixel + "컬러");
	}
}

class IPTV extends ColorTV {
	String ip;
	
	IPTV(String ip, int size, int pixel) {
		super(size, pixel);
		this.ip = ip;
		
		System.out.println("IPTV 객체 생성 완료입니다.");
	}
	// printProperty()는 상속이 완료 된 상태이지만 재정의가 필요
	
	void printProperty() {
		System.out.print("나의 IPTV는 " + ip + " 주소의 " + getSize() + "인치" + pixel + "컬러");
	}
}

public class HomeAppliance {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
