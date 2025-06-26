package TV출력;

class G_TV{
	String name;
	int year;
	int size;
	
	G_TV(String name, int year, int size) {
		this.name = name;
		this.year = year;
		this.size = size;
		
		System.out.println("객체가 생성 되었습니다.");
	}
	void show() {
		System.out.println(name + "에서 만든 " + year + "년형 " + size + "인치 TV");
	}
}

public class TV {
	public static void main(String[] args) {
		G_TV myTV = new G_TV("LG", 2017, 32);
		myTV.show();
	}
}
