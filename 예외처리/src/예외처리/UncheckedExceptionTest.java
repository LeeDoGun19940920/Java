package 예외처리;

import java.util.ArrayList;

public class UncheckedExceptionTest {
	public static void main(String[] args) {
		ArrayList<String> names = null;
		// reference 변수 선언만 했지, 배열형태의 객체를 참조시켜 주지 않았기에 객체 생성이 안 되었다.
		names.add("Park");
	}
}
