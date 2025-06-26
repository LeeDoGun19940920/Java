package 인터페이스_휴대폰;

import java.util.Scanner;

interface PhoneInterface {
	int TIMEOUT = 10000; // 자동적으로 public static final 로 지정 된다.
	void sendCall(); // pubic abstract 으로 자동 지정 된다.
	void receiveCall();
	default void printLogo(String brand) { // default 메소드는 구현이 아닌 상속이다.
		System.out.println("선택 된 브랜드는 " + brand + "입니다.");
	}
	static void request() {
		System.out.println("원하시는 요청이 무엇이신가요?");
		System.out.println("혹시 음악을 듣고 싶으신가요?");
		System.out.println("Yes == 1, No == 2");
	}
}

interface MobilePhoneInterface extends PhoneInterface {
	// 총 6개의 메소드와 1개의 상수를 가지는 interface가 정의된다.
	public abstract void sendSMS(String request);
	void receiveSMS(String message);
}

interface MP3Interface {
	void MusicPlay();
	public abstract void MusicStop();
}

class PDA {
	public int calculate(int x, int y) {
		return x + y;
	}
}

class SamsungPhone extends PDA implements MobilePhoneInterface, MP3Interface {
	Scanner scan = new Scanner(System.in);
	@Override
	public void sendCall() {
		System.out.println("띠리리링");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	// 현 클래스 내에 새롭게 정의 된 메소드
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}

	@Override
	public void MusicPlay() {
		System.out.println("음악을 실행 하시겠습니까?");
	}
	void selectMusic() {
		int select;
		
		System.out.println("음악을 선택하세요");
		System.out.println("1: ost, 2: 발라드, 3: 재즈, 4: 랩");
		
		select = scan.nextInt();
		if(select == 1) {
			System.out.println("ost 실행합니다. 사이버펑크 엣지 러너 노래를 추천하고 싶어요 ^^&&&");
		}
		if(select == 2) {
			System.out.println("발라드 실행합니다.");
		}
		if(select == 3) {
			System.out.println("재즈 실행합니다.");
		}
		if(select == 4) {
			System.out.println("랩 실행합니다.");
		}
	}

	@Override
	public void MusicStop() {
		System.out.println("음악을 그만 듣고 싶으세요?");
		System.out.println("다른 작업은 없으신가요?");
	}

	@Override
	public void sendSMS(String request) {
		System.out.println("메세지를 보내시려고 하시네요");
		System.out.println("원하시는 메세지를 작성하세요");
	}

	@Override
	public void receiveSMS(String message) {
		System.out.println("메세지를 전달 받았습니다.");
		System.out.println("전달 받은 메세지는 " + message +" 입니다.");
	}
}

public class InterfaceEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SamsungPhone sp = new SamsungPhone();
		
		System.out.print("브랜드가 어떻게 되시나요?");
		String brand = scan.next();
		
		sp.printLogo(brand); // default로 선언된 메소드 이기에 별도의 overriding 없이 호출이 가능하다.
		sp.sendCall();
		sp.receiveCall();
		sp.flash();
		PhoneInterface.request(); // Interface의 static method 이므로 interface를 통한 호출만이 가능하다. 소속 고정으로 인한 상속 및 재정의가 불가능하다. 재정의 == 소속 변경
		
		int answer = scan.nextInt();
		if(answer == 1) {
			sp.MusicPlay();
			sp.selectMusic();
		}else if(answer == 2) {
			System.out.print("더 이상 제가 필요 없으시군요. 알겠습니다.");
			scan.close();
			System.exit(0);
		}
		sp.MusicStop();
		scan.next();
		
		String request = scan.nextLine();
		sp.sendSMS(request);
		
		String message = scan.nextLine();
		sp.receiveSMS(message);
		
		System.out.println("계산이 필요하신가요? 정수 2개를 각각 입력하세요");
		System.out.print(sp.calculate(scan.nextInt(), scan.nextInt()));
		
		scan.close();
	}
}
