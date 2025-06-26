package 예외처리;

public class ThrowTest {
	public static void main(String[] args) {
		try {
			aaa();
		}catch(MyException ex) {
			ex.printStackTrace();
		}
	}
	private static void aaa() throws MyException {
		System.out.println("aaa() 메소드가 호출되었습니다.");
		bbb();
	}
	private static void bbb() throws MyException {
		System.out.println("bbb() 메소드가 호출되었습니다.");
		throw new MyException("예외가 터졌습니다."); 
		// MyException ex = throw new MyException("예외가 터졌습니다."); 예외 생성 class 객체화
	}
}

class MyException extends Throwable { // Throwable class 상속하는 MyException 클래스 작성
	public MyException(String message){// MyException class를 instance화 하는 생성자
		super(message);
	}
}