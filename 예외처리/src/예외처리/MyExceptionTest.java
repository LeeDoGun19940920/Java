package 예외처리;

public class MyExceptionTest {
	public static void main(String[] args) {
		try {
			//throw new MyException("예외 발생시키자"); 
			throw new MyException();
		} catch(MyException ex) { 
			// MyException ex = new MyException("예외 발생시키자");
			// "예외 발생시키자" 문장이 들어 온 객체를 생성.
			
			System.out.printf("예외 메세지: %s\n", ex.getMessage());
			/* public String getMessage() {
        		return detailMessage;
    			} */ 
		}
	}
}

//개발자용 Exception class 작성
class MyException extends Throwable {
	
	public MyException() {
		super("내가 만든 예외 발생"); // 
		}
	
	public MyException(String message) { 
		super(message); // Throwable class 객체 생성자 호출, arguments == message
		
		/* 
		 MyException ex = new MyException("예외 발생시키자"); 객체 생성자 method
		 
		  public Throwable(String message) {
        	fillInStackTrace();
        	detailMessage = message;
    }
		 */
	}
}